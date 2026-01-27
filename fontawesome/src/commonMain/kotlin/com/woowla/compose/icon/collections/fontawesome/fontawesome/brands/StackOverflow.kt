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
                moveTo(291.0f, 311.0f)
                lineToRelative(-195.7f, -41.3f)
                lineToRelative(-8.2f, 39.3f)
                lineToRelative(195.7f, 41.0f)
                lineToRelative(8.2f, -39.0f)
                close()
                moveTo(342.0f, 224.0f)
                lineTo(188.5f, 95.7f)
                lineTo(163.0f, 126.5f)
                lineTo(316.5f, 254.8f)
                lineTo(342.0f, 224.0f)
                close()
                moveTo(310.8f, 263.7f)
                lineTo(129.5f, 179.0f)
                lineTo(112.8f, 215.5f)
                lineTo(294.0f, 300.0f)
                lineTo(310.8f, 263.7f)
                close()
                moveTo(262.3f, 32.0f)
                lineToRelative(-32.0f, 24.0f)
                lineToRelative(119.3f, 160.3f)
                lineToRelative(32.0f, -24.0f)
                lineToRelative(-119.3f, -160.3f)
                close()
                moveTo(282.8f, 360.0f)
                lineToRelative(-200.0f, 0.0f)
                lineToRelative(0.0f, 39.7f)
                lineToRelative(200.0f, 0.0f)
                lineToRelative(0.0f, -39.7f)
                close()
                moveTo(322.5f, 440.0f)
                lineToRelative(-279.5f, 0.0f)
                lineToRelative(0.0f, -120.0f)
                lineToRelative(-40.0f, 0.0f)
                lineToRelative(0.0f, 160.0f)
                lineToRelative(359.5f, 0.0f)
                lineToRelative(0.0f, -160.0f)
                lineToRelative(-40.0f, 0.0f)
                lineToRelative(0.0f, 120.0f)
                close()
            }
        }
        .build()
        return _stackOverflow!!
    }

private var _stackOverflow: ImageVector? = null
