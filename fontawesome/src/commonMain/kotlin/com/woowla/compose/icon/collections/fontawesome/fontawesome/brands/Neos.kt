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

public val BrandsGroup.Neos: ImageVector
    get() {
        if (_neos != null) {
            return _neos!!
        }
        _neos = Builder(name = "Neos", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(383.8f, 512.0f)
                lineToRelative(-95.1f, 0.0f)
                lineToRelative(-108.2f, -154.5f)
                lineToRelative(0.0f, 91.1f)
                lineToRelative(-86.4f, 63.4f)
                lineToRelative(-97.7f, 0.0f)
                lineToRelative(0.0f, -482.2f)
                lineToRelative(40.5f, -29.8f)
                lineToRelative(108.0f, 0.0f)
                lineToRelative(123.7f, 176.1f)
                lineToRelative(0.0f, -112.7f)
                lineToRelative(86.4f, -63.4f)
                lineToRelative(97.7f, 0.0f)
                lineToRelative(0.0f, 461.5f)
                lineToRelative(-68.9f, 50.5f)
                close()
                moveTo(7.2f, 35.3f)
                lineToRelative(0.0f, 460.7f)
                lineToRelative(72.0f, -52.9f)
                lineToRelative(0.0f, -249.1f)
                lineToRelative(215.5f, 307.6f)
                lineToRelative(84.8f, 0.0f)
                lineToRelative(52.4f, -38.2f)
                lineToRelative(-78.3f, 0.0f)
                lineToRelative(-316.1f, -450.5f)
                lineToRelative(-30.2f, 22.3f)
                close()
                moveTo(89.7f, 501.9f)
                lineToRelative(80.0f, -58.8f)
                lineToRelative(0.0f, -101.0f)
                lineToRelative(-79.8f, -114.4f)
                lineToRelative(0.0f, 220.9f)
                lineToRelative(-72.6f, 53.3f)
                lineToRelative(72.3f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                close()
                moveTo(49.0f, 10.8f)
                lineToRelative(310.6f, 442.6f)
                lineToRelative(82.4f, 0.0f)
                lineToRelative(0.0f, -442.6f)
                lineToRelative(-79.8f, 0.0f)
                lineToRelative(0.0f, 317.6f)
                lineToRelative(-222.9f, -317.6f)
                lineToRelative(-90.3f, 0.0f)
                close()
                moveTo(279.4f, 191.6f)
                lineToRelative(72.0f, 102.8f)
                lineToRelative(0.0f, -278.5f)
                lineToRelative(-72.0f, 53.0f)
                lineToRelative(0.0f, 122.7f)
                close()
            }
        }
        .build()
        return _neos!!
    }

private var _neos: ImageVector? = null
