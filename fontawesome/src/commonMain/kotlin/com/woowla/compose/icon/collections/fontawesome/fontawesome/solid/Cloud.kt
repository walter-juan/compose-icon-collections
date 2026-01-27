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

public val SolidGroup.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 336.0f)
                curveToRelative(0.0f, 79.5f, 64.5f, 144.0f, 144.0f, 144.0f)
                lineToRelative(304.0f, 0.0f)
                curveToRelative(70.7f, 0.0f, 128.0f, -57.3f, 128.0f, -128.0f)
                curveToRelative(0.0f, -51.6f, -30.5f, -96.1f, -74.5f, -116.3f)
                curveToRelative(6.7f, -13.1f, 10.5f, -28.0f, 10.5f, -43.7f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                curveToRelative(-17.7f, 0.0f, -34.2f, 4.8f, -48.4f, 13.1f)
                curveToRelative(-24.1f, -45.8f, -72.2f, -77.1f, -127.6f, -77.1f)
                curveToRelative(-79.5f, 0.0f, -144.0f, 64.5f, -144.0f, 144.0f)
                curveToRelative(0.0f, 8.0f, 0.7f, 15.9f, 1.9f, 23.5f)
                curveToRelative(-56.9f, 19.2f, -97.9f, 73.1f, -97.9f, 136.5f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
