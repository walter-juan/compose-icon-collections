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

public val Twbs.CloudRainHeavyFill: ImageVector
    get() {
        if (_cloudRainHeavyFill != null) {
            return _cloudRainHeavyFill!!
        }
        _cloudRainHeavyFill = Builder(name = "CloudRainHeavyFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.176f, 11.032f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.292f, 0.643f)
                lineToRelative(-1.5f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.936f, -0.35f)
                lineToRelative(1.5f, -4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.644f, -0.293f)
                moveToRelative(3.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.292f, 0.643f)
                lineToRelative(-1.5f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.936f, -0.35f)
                lineToRelative(1.5f, -4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.644f, -0.293f)
                moveToRelative(3.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.292f, 0.643f)
                lineToRelative(-1.5f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.936f, -0.35f)
                lineToRelative(1.5f, -4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.644f, -0.293f)
                moveToRelative(3.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.292f, 0.643f)
                lineToRelative(-1.5f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.936f, -0.35f)
                lineToRelative(1.5f, -4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.644f, -0.293f)
                moveToRelative(0.229f, -7.005f)
                arcToRelative(5.001f, 5.001f, 0.0f, false, false, -9.499f, -1.004f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 3.5f, 10.0f)
                horizontalLineTo(13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.405f, -5.973f)
            }
        }
        .build()
        return _cloudRainHeavyFill!!
    }

private var _cloudRainHeavyFill: ImageVector? = null
