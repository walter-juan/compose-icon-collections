package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.GooglePlayFill: ImageVector
    get() {
        if (_googlePlayFill != null) {
            return _googlePlayFill!!
        }
        _googlePlayFill = Builder(name = "GooglePlayFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.61f, 1.814f)
                lineTo(13.793f, 12.0f)
                lineTo(3.611f, 22.186f)
                curveTo(3.418f, 22.105f, 3.249f, 21.962f, 3.136f, 21.767f)
                curveTo(3.047f, 21.614f, 3.001f, 21.442f, 3.001f, 21.266f)
                verticalLineTo(2.735f)
                curveTo(3.001f, 2.321f, 3.252f, 1.966f, 3.61f, 1.814f)
                close()
                moveTo(14.5f, 12.707f)
                lineTo(16.802f, 15.009f)
                lineTo(5.865f, 21.342f)
                lineTo(14.5f, 12.707f)
                close()
                moveTo(17.699f, 9.509f)
                lineTo(20.506f, 11.135f)
                curveTo(20.984f, 11.411f, 21.147f, 12.023f, 20.871f, 12.501f)
                curveTo(20.783f, 12.652f, 20.657f, 12.778f, 20.506f, 12.866f)
                lineTo(17.698f, 14.491f)
                lineTo(15.207f, 12.0f)
                lineTo(17.699f, 9.509f)
                close()
                moveTo(5.865f, 2.658f)
                lineTo(16.803f, 8.99f)
                lineTo(14.5f, 11.293f)
                lineTo(5.865f, 2.658f)
                close()
            }
        }
        .build()
        return _googlePlayFill!!
    }

private var _googlePlayFill: ImageVector? = null
