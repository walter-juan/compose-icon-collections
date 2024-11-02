package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Visx: ImageVector
    get() {
        if (_visx != null) {
            return _visx!!
        }
        _visx = Builder(name = "Visx", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.002f, 0.0f)
                lineTo(12.0f, 11.52f)
                lineTo(23.998f, 0.0f)
                horizontalLineToRelative(-5.871f)
                lineTo(12.0f, 6.09f)
                lineTo(5.873f, 0.0f)
                close()
                moveTo(23.998f, 0.0f)
                lineTo(12.479f, 11.998f)
                lineToRelative(11.52f, 11.998f)
                lineTo(23.998f, 18.125f)
                lineToRelative(-6.09f, -6.127f)
                lineToRelative(6.09f, -6.127f)
                close()
                moveTo(0.002f, 0.004f)
                lineTo(0.002f, 5.875f)
                lineToRelative(6.09f, 6.127f)
                lineToRelative(-6.09f, 6.127f)
                lineTo(0.002f, 24.0f)
                lineToRelative(11.504f, -11.998f)
                close()
                moveTo(0.002f, 24.0f)
                horizontalLineToRelative(5.871f)
                lineTo(12.0f, 17.91f)
                lineTo(18.127f, 24.0f)
                horizontalLineToRelative(5.871f)
                lineTo(12.0f, 12.471f)
                close()
            }
        }
        .build()
        return _visx!!
    }

private var _visx: ImageVector? = null
