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

public val SolidGroup.BxsError: ImageVector
    get() {
        if (_bxsError != null) {
            return _bxsError!!
        }
        _bxsError = Builder(name = "BxsError", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.884f, 2.532f)
                curveToRelative(-0.346f, -0.654f, -1.422f, -0.654f, -1.768f, 0.0f)
                lineToRelative(-9.0f, 17.0f)
                arcTo(0.999f, 0.999f, 0.0f, false, false, 3.0f, 21.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, 0.883f, -1.467f)
                lineTo(12.884f, 2.532f)
                close()
                moveTo(13.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(11.0f, 14.0f)
                lineTo(11.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.001f, 5.0f)
                lineTo(11.0f, 14.0f)
                close()
            }
        }
        .build()
        return _bxsError!!
    }

private var _bxsError: ImageVector? = null
