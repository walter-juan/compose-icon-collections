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

public val Twbs.Trello: ImageVector
    get() {
        if (_trello != null) {
            return _trello!!
        }
        _trello = Builder(name = "Trello", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.1f, 0.0f)
                lineTo(1.903f, 0.0f)
                curveTo(0.852f, 0.0f, 0.002f, 0.85f, 0.0f, 1.9f)
                verticalLineToRelative(12.19f)
                arcTo(1.9f, 1.9f, 0.0f, false, false, 1.902f, 16.0f)
                horizontalLineToRelative(12.199f)
                arcTo(1.9f, 1.9f, 0.0f, false, false, 16.0f, 14.09f)
                lineTo(16.0f, 1.9f)
                arcTo(1.9f, 1.9f, 0.0f, false, false, 14.1f, 0.0f)
                moveTo(7.0f, 11.367f)
                arcToRelative(0.636f, 0.636f, 0.0f, false, true, -0.64f, 0.633f)
                lineTo(3.593f, 12.0f)
                arcToRelative(0.633f, 0.633f, 0.0f, false, true, -0.63f, -0.633f)
                lineTo(2.963f, 3.583f)
                curveToRelative(0.0f, -0.348f, 0.281f, -0.631f, 0.63f, -0.633f)
                horizontalLineToRelative(2.765f)
                curveToRelative(0.35f, 0.002f, 0.632f, 0.284f, 0.633f, 0.633f)
                close()
                moveTo(13.052f, 7.867f)
                arcToRelative(0.633f, 0.633f, 0.0f, false, true, -0.64f, 0.633f)
                horizontalLineToRelative(-2.78f)
                arcTo(0.636f, 0.636f, 0.0f, false, true, 9.0f, 7.867f)
                lineTo(9.0f, 3.583f)
                arcToRelative(0.636f, 0.636f, 0.0f, false, true, 0.633f, -0.633f)
                horizontalLineToRelative(2.778f)
                curveToRelative(0.35f, 0.002f, 0.631f, 0.285f, 0.631f, 0.633f)
                close()
            }
        }
        .build()
        return _trello!!
    }

private var _trello: ImageVector? = null
