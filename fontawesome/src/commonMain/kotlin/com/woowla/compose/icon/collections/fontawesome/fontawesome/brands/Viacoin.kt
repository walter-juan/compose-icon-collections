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

public val BrandsGroup.Viacoin: ImageVector
    get() {
        if (_viacoin != null) {
            return _viacoin!!
        }
        _viacoin = Builder(name = "Viacoin", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 32.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(-80.7f, 192.0f)
                lineToRelative(-94.5f, 0.0f)
                lineToRelative(-80.8f, -192.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(48.0f, 112.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, 48.0f)
                lineToRelative(68.5f, 0.0f)
                lineToRelative(13.8f, 32.0f)
                lineToRelative(-82.3f, 0.0f)
                lineToRelative(0.0f, 48.0f)
                lineToRelative(102.8f, 0.0f)
                lineToRelative(89.2f, 208.0f)
                lineToRelative(89.2f, -208.0f)
                lineToRelative(102.8f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(-82.3f, 0.0f)
                lineToRelative(13.8f, -32.0f)
                lineToRelative(68.5f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(48.0f, -112.0f)
                close()
                moveTo(192.0f, 336.0f)
                lineToRelative(-27.0f, -64.0f)
                lineToRelative(54.0f, 0.0f)
                lineToRelative(-27.0f, 64.0f)
                close()
            }
        }
        .build()
        return _viacoin!!
    }

private var _viacoin: ImageVector? = null
