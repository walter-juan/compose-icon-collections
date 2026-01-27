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

public val BrandsGroup.Yahoo: ImageVector
    get() {
        if (_yahoo != null) {
            return _yahoo!!
        }
        _yahoo = Builder(name = "Yahoo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.8f, 141.1f)
                lineToRelative(-56.7f, 143.2f)
                lineToRelative(-56.0f, -143.2f)
                lineToRelative(-96.1f, 0.0f)
                lineToRelative(105.8f, 249.1f)
                lineToRelative(-38.6f, 89.8f)
                lineToRelative(94.2f, 0.0f)
                lineToRelative(140.9f, -338.9f)
                lineToRelative(-93.6f, 0.0f)
                close()
                moveTo(329.2f, 276.9f)
                arcToRelative(58.2f, 58.2f, 0.0f, true, false, 0.0f, 116.4f)
                arcToRelative(58.2f, 58.2f, 0.0f, true, false, 0.0f, -116.4f)
                close()
                moveTo(394.7f, 32.0f)
                lineToRelative(-93.0f, 223.5f)
                lineToRelative(104.8f, 0.0f)
                lineToRelative(92.6f, -223.5f)
                lineToRelative(-104.4f, 0.0f)
                close()
            }
        }
        .build()
        return _yahoo!!
    }

private var _yahoo: ImageVector? = null
