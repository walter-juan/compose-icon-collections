package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlWindows: ImageVector
    get() {
        if (_bxlWindows != null) {
            return _bxlWindows!!
        }
        _bxlWindows = Builder(name = "BxlWindows", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 5.557f)
                lineToRelative(7.357f, -1.002f)
                lineToRelative(0.004f, 7.097f)
                lineToRelative(-7.354f, 0.042f)
                lineTo(3.0f, 5.557f)
                close()
                moveTo(10.354f, 12.47f)
                lineTo(10.36f, 19.573f)
                lineTo(3.006f, 18.562f)
                verticalLineToRelative(-6.14f)
                lineToRelative(7.348f, 0.048f)
                close()
                moveTo(11.246f, 4.424f)
                lineTo(21.001f, 3.0f)
                verticalLineToRelative(8.562f)
                lineToRelative(-9.755f, 0.077f)
                lineTo(11.246f, 4.424f)
                close()
                moveTo(21.004f, 12.537f)
                lineTo(21.001f, 21.06f)
                lineTo(11.246f, 19.682f)
                lineTo(11.232f, 12.521f)
                lineTo(21.004f, 12.537f)
                close()
            }
        }
        .build()
        return _bxlWindows!!
    }

private var _bxlWindows: ImageVector? = null
