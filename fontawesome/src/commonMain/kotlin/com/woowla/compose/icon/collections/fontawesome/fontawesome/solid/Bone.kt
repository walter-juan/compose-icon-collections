package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.Bone: ImageVector
    get() {
        if (_bone != null) {
            return _bone!!
        }
        _bone = Builder(name = "Bone", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(197.4f, 160.0f)
                curveToRelative(-3.9f, 0.0f, -7.2f, -2.8f, -8.1f, -6.6f)
                curveToRelative(-10.2f, -42.1f, -48.1f, -73.4f, -93.3f, -73.4f)
                curveToRelative(-53.0f, 0.0f, -96.0f, 43.0f, -96.0f, 96.0f)
                curveToRelative(0.0f, 29.1f, 12.9f, 55.1f, 33.3f, 72.7f)
                curveToRelative(4.3f, 3.7f, 4.3f, 10.8f, 0.0f, 14.5f)
                curveToRelative(-20.4f, 17.6f, -33.3f, 43.7f, -33.3f, 72.7f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                curveToRelative(45.2f, 0.0f, 83.1f, -31.3f, 93.3f, -73.4f)
                curveToRelative(0.9f, -3.8f, 4.2f, -6.6f, 8.1f, -6.6f)
                lineToRelative(245.1f, 0.0f)
                curveToRelative(3.9f, 0.0f, 7.2f, 2.8f, 8.1f, 6.6f)
                curveToRelative(10.2f, 42.1f, 48.1f, 73.4f, 93.3f, 73.4f)
                curveToRelative(53.0f, 0.0f, 96.0f, -43.0f, 96.0f, -96.0f)
                curveToRelative(0.0f, -29.1f, -12.9f, -55.1f, -33.3f, -72.7f)
                curveToRelative(-4.3f, -3.7f, -4.3f, -10.8f, 0.0f, -14.5f)
                curveToRelative(20.4f, -17.6f, 33.3f, -43.7f, 33.3f, -72.7f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                curveToRelative(-45.2f, 0.0f, -83.1f, 31.3f, -93.3f, 73.4f)
                curveToRelative(-0.9f, 3.8f, -4.2f, 6.6f, -8.1f, 6.6f)
                lineToRelative(-245.1f, 0.0f)
                close()
            }
        }
        .build()
        return _bone!!
    }

private var _bone: ImageVector? = null
