package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxCubeAlt: ImageVector
    get() {
        if (_bxCubeAlt != null) {
            return _bxCubeAlt!!
        }
        _bxCubeAlt = Builder(name = "BxCubeAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.895f, 3.553f)
                arcTo(1.001f, 1.001f, 0.0f, false, false, 17.0f, 3.0f)
                lineTo(7.0f, 3.0f)
                curveToRelative(-0.379f, 0.0f, -0.725f, 0.214f, -0.895f, 0.553f)
                lineToRelative(-4.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 0.895f)
                lineToRelative(4.0f, 8.0f)
                curveToRelative(0.17f, 0.338f, 0.516f, 0.552f, 0.895f, 0.552f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.379f, 0.0f, 0.725f, -0.214f, 0.895f, -0.553f)
                lineToRelative(4.0f, -8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -0.895f)
                lineToRelative(-4.0f, -7.999f)
                close()
                moveTo(19.382f, 11.0f)
                horizontalLineToRelative(-7.764f)
                lineToRelative(-3.0f, -6.0f)
                horizontalLineToRelative(7.764f)
                lineToRelative(3.0f, 6.0f)
                close()
                moveTo(4.118f, 12.0f)
                lineTo(7.0f, 6.236f)
                lineTo(9.882f, 12.0f)
                lineTo(7.0f, 17.764f)
                lineTo(4.118f, 12.0f)
                close()
                moveTo(16.382f, 19.0f)
                lineTo(8.618f, 19.0f)
                lineToRelative(3.0f, -6.0f)
                horizontalLineToRelative(7.764f)
                lineToRelative(-3.0f, 6.0f)
                close()
            }
        }
        .build()
        return _bxCubeAlt!!
    }

private var _bxCubeAlt: ImageVector? = null
