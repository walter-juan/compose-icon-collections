package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Plugin: ImageVector
    get() {
        if (_plugin != null) {
            return _plugin!!
        }
        _plugin = Builder(name = "Plugin", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.0f, 8.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 2.898f, 5.673f)
                curveToRelative(-0.167f, -0.121f, -0.216f, -0.406f, -0.002f, -0.62f)
                lineToRelative(1.8f, -1.8f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 4.572f, -0.328f)
                lineToRelative(1.414f, -1.415f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.707f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(1.559f, -1.563f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.708f, -0.706f)
                lineToRelative(-1.559f, 1.562f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.56f, -1.562f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.707f, -0.706f)
                lineToRelative(-1.56f, 1.56f)
                lineToRelative(-0.707f, -0.706f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.707f, 0.0f)
                lineTo(5.318f, 5.975f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -0.328f, 4.571f)
                lineToRelative(-1.8f, 1.8f)
                curveToRelative(-0.58f, 0.58f, -0.62f, 1.6f, 0.121f, 2.137f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 0.0f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
            }
        }
        .build()
        return _plugin!!
    }

private var _plugin: ImageVector? = null
