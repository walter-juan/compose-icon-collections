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

public val Twbs.PlayFill: ImageVector
    get() {
        if (_playFill != null) {
            return _playFill!!
        }
        _playFill = Builder(name = "PlayFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.596f, 8.697f)
                lineToRelative(-6.363f, 3.692f)
                curveToRelative(-0.54f, 0.313f, -1.233f, -0.066f, -1.233f, -0.697f)
                verticalLineTo(4.308f)
                curveToRelative(0.0f, -0.63f, 0.692f, -1.01f, 1.233f, -0.696f)
                lineToRelative(6.363f, 3.692f)
                arcToRelative(0.802f, 0.802f, 0.0f, false, true, 0.0f, 1.393f)
            }
        }
        .build()
        return _playFill!!
    }

private var _playFill: ImageVector? = null
