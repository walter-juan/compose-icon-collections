package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.StackOverflow: ImageVector
    get() {
        if (_stackOverflow != null) {
            return _stackOverflow!!
        }
        _stackOverflow = Builder(name = "StackOverflow", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(290.7f, 311.0f)
                lineTo(95.0f, 269.7f)
                lineTo(86.8f, 309.0f)
                lineToRelative(195.7f, 41.0f)
                close()
                moveTo(341.7f, 224.0f)
                lineTo(188.2f, 95.7f)
                lineToRelative(-25.5f, 30.8f)
                lineToRelative(153.5f, 128.3f)
                close()
                moveTo(310.5f, 263.7f)
                lineTo(129.2f, 179.0f)
                lineToRelative(-16.7f, 36.5f)
                lineTo(293.7f, 300.0f)
                close()
                moveTo(262.0f, 32.0f)
                lineToRelative(-32.0f, 24.0f)
                lineToRelative(119.3f, 160.3f)
                lineToRelative(32.0f, -24.0f)
                close()
                moveTo(282.5f, 360.0f)
                horizontalLineToRelative(-200.0f)
                verticalLineToRelative(39.7f)
                horizontalLineToRelative(200.0f)
                close()
                moveTo(322.2f, 440.0f)
                lineTo(42.7f, 440.0f)
                lineTo(42.7f, 320.0f)
                horizontalLineToRelative(-40.0f)
                verticalLineToRelative(160.0f)
                horizontalLineToRelative(359.5f)
                lineTo(362.2f, 320.0f)
                horizontalLineToRelative(-40.0f)
                close()
            }
        }
        .build()
        return _stackOverflow!!
    }

private var _stackOverflow: ImageVector? = null
