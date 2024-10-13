package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsHomeCircle: ImageVector
    get() {
        if (_bxsHomeCircle != null) {
            return _bxsHomeCircle!!
        }
        _bxsHomeCircle = Builder(name = "BxsHomeCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.743f, 12.331f)
                lineToRelative(-9.0f, -10.0f)
                curveToRelative(-0.379f, -0.422f, -1.107f, -0.422f, -1.486f, 0.0f)
                lineToRelative(-9.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, 0.743f, -1.669f)
                close()
                moveTo(12.0f, 16.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 6.0f)
                close()
            }
        }
        .build()
        return _bxsHomeCircle!!
    }

private var _bxsHomeCircle: ImageVector? = null
