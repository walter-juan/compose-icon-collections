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

public val BrandsGroup.Digg: ImageVector
    get() {
        if (_digg != null) {
            return _digg!!
        }
        _digg = Builder(name = "Digg", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(81.7f, 172.3f)
                lineToRelative(-81.7f, 0.0f)
                lineToRelative(0.0f, 174.4f)
                lineToRelative(132.7f, 0.0f)
                lineToRelative(0.0f, -250.7f)
                lineToRelative(-51.0f, 0.0f)
                lineToRelative(0.0f, 76.3f)
                close()
                moveTo(81.7f, 305.7f)
                lineToRelative(-30.8f, 0.0f)
                lineToRelative(0.0f, -92.3f)
                lineToRelative(30.8f, 0.0f)
                lineToRelative(0.0f, 92.3f)
                close()
                moveTo(378.9f, 172.3f)
                lineToRelative(0.0f, 174.4f)
                lineToRelative(81.8f, 0.0f)
                lineToRelative(0.0f, 28.5f)
                lineToRelative(-81.8f, 0.0f)
                lineToRelative(0.0f, 40.8f)
                lineToRelative(133.1f, 0.0f)
                lineToRelative(0.0f, -243.7f)
                lineToRelative(-133.1f, 0.0f)
                close()
                moveTo(460.7f, 305.7f)
                lineToRelative(-30.8f, 0.0f)
                lineToRelative(0.0f, -92.3f)
                lineToRelative(30.8f, 0.0f)
                lineToRelative(0.0f, 92.3f)
                close()
                moveTo(225.1f, 346.7f)
                lineToRelative(82.1f, 0.0f)
                lineToRelative(0.0f, 28.5f)
                lineToRelative(-82.1f, 0.0f)
                lineToRelative(0.0f, 40.8f)
                lineToRelative(133.3f, 0.0f)
                lineToRelative(0.0f, -243.7f)
                lineToRelative(-133.3f, 0.0f)
                lineToRelative(0.0f, 174.4f)
                close()
                moveTo(276.3f, 213.4f)
                lineToRelative(30.8f, 0.0f)
                lineToRelative(0.0f, 92.3f)
                lineToRelative(-30.8f, 0.0f)
                lineToRelative(0.0f, -92.3f)
                close()
                moveTo(153.3f, 96.0f)
                lineToRelative(51.3f, 0.0f)
                lineToRelative(0.0f, 51.0f)
                lineToRelative(-51.3f, 0.0f)
                lineToRelative(0.0f, -51.0f)
                close()
                moveTo(153.3f, 172.3f)
                lineToRelative(51.3f, 0.0f)
                lineToRelative(0.0f, 174.4f)
                lineToRelative(-51.3f, 0.0f)
                lineToRelative(0.0f, -174.4f)
                close()
            }
        }
        .build()
        return _digg!!
    }

private var _digg: ImageVector? = null
