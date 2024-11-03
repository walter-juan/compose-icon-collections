package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Vimeo: ImageVector
    get() {
        if (_vimeo != null) {
            return _vimeo!!
        }
        _vimeo = Builder(name = "Vimeo", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.992f, 4.204f)
                quadToRelative(-0.106f, 2.334f, -3.262f, 6.393f)
                quadToRelative(-3.263f, 4.243f, -5.522f, 4.243f)
                quadToRelative(-1.4f, 0.0f, -2.367f, -2.583f)
                lineTo(3.55f, 7.523f)
                quadTo(2.83f, 4.939f, 2.007f, 4.94f)
                quadToRelative(-0.178f, 0.001f, -1.254f, 0.754f)
                lineTo(0.0f, 4.724f)
                arcToRelative(210.0f, 210.0f, 0.0f, false, false, 2.334f, -2.081f)
                quadToRelative(1.581f, -1.364f, 2.373f, -1.437f)
                quadToRelative(1.865f, -0.185f, 2.298f, 2.553f)
                quadToRelative(0.466f, 2.952f, 0.646f, 3.666f)
                quadToRelative(0.54f, 2.447f, 1.186f, 2.445f)
                quadToRelative(0.5f, 0.0f, 1.508f, -1.587f)
                quadToRelative(1.006f, -1.587f, 1.077f, -2.415f)
                quadToRelative(0.144f, -1.37f, -1.077f, -1.37f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.185f, 0.261f)
                quadToRelative(1.183f, -3.86f, 4.508f, -3.756f)
                quadToRelative(2.466f, 0.075f, 2.324f, 3.2f)
                close()
            }
        }
        .build()
        return _vimeo!!
    }

private var _vimeo: ImageVector? = null
