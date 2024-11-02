package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Newrelic: ImageVector
    get() {
        if (_newrelic != null) {
            return _newrelic!!
        }
        _newrelic = Builder(name = "Newrelic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.002f, 14.309f)
                verticalLineToRelative(7.384f)
                lineTo(12.001f, 24.0f)
                verticalLineTo(12.001f)
                lineTo(1.608f, 6.0f)
                verticalLineToRelative(4.617f)
                close()
                moveTo(12.001f, 0.0f)
                lineTo(2.823f, 5.298f)
                lineTo(6.821f, 7.606f)
                lineToRelative(5.18f, -2.989f)
                lineToRelative(6.394f, 3.691f)
                verticalLineToRelative(7.384f)
                lineToRelative(-5.178f, 2.991f)
                verticalLineToRelative(4.617f)
                lineToRelative(9.176f, -5.299f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _newrelic!!
    }

private var _newrelic: ImageVector? = null
