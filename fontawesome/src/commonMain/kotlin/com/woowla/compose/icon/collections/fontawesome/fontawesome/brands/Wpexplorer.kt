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

public val BrandsGroup.Wpexplorer: ImageVector
    get() {
        if (_wpexplorer != null) {
            return _wpexplorer!!
        }
        _wpexplorer = Builder(name = "Wpexplorer", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
                close()
                moveTo(480.0f, 256.0f)
                arcToRelative(224.0f, 224.0f, 0.0f, true, false, -448.0f, 0.0f)
                arcToRelative(224.0f, 224.0f, 0.0f, true, false, 448.0f, 0.0f)
                close()
                moveTo(160.9f, 124.6f)
                lineToRelative(86.9f, 37.1f)
                lineToRelative(-37.1f, 86.9f)
                lineToRelative(-86.9f, -37.1f)
                lineToRelative(37.1f, -86.9f)
                close()
                moveTo(270.9f, 293.7f)
                lineToRelative(46.6f, 94.0f)
                lineToRelative(-14.6f, 0.0f)
                lineToRelative(-50.0f, -100.0f)
                lineToRelative(-48.9f, 100.0f)
                lineToRelative(-14.0f, 0.0f)
                lineToRelative(51.1f, -106.9f)
                lineToRelative(-22.3f, -9.4f)
                lineToRelative(6.0f, -14.0f)
                lineToRelative(68.6f, 29.1f)
                lineToRelative(-6.0f, 14.3f)
                lineToRelative(-16.5f, -7.1f)
                close()
                moveTo(259.1f, 177.4f)
                lineToRelative(68.6f, 29.4f)
                lineToRelative(-29.4f, 68.3f)
                lineToRelative(-68.3f, -29.1f)
                lineToRelative(29.1f, -68.6f)
                close()
                moveTo(339.4f, 220.3f)
                lineToRelative(54.6f, 23.1f)
                lineToRelative(-23.4f, 54.3f)
                lineToRelative(-54.3f, -23.1f)
                lineToRelative(23.1f, -54.3f)
                close()
            }
        }
        .build()
        return _wpexplorer!!
    }

private var _wpexplorer: ImageVector? = null
