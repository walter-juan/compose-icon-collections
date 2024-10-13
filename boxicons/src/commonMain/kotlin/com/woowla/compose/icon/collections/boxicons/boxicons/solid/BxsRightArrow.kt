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

public val SolidGroup.BxsRightArrow: ImageVector
    get() {
        if (_bxsRightArrow != null) {
            return _bxsRightArrow!!
        }
        _bxsRightArrow = Builder(name = "BxsRightArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.536f, 21.886f)
                arcToRelative(1.004f, 1.004f, 0.0f, false, false, 1.033f, -0.064f)
                lineToRelative(13.0f, -9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.644f)
                lineToRelative(-13.0f, -9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 3.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.536f, 0.886f)
                close()
            }
        }
        .build()
        return _bxsRightArrow!!
    }

private var _bxsRightArrow: ImageVector? = null
