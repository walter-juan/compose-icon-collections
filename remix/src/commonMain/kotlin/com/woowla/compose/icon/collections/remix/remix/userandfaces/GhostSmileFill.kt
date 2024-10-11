package com.woowla.compose.icon.collections.remix.remix.userandfaces

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.UserAndFacesGroup

public val UserAndFacesGroup.GhostSmileFill: ImageVector
    get() {
        if (_ghostSmileFill != null) {
            return _ghostSmileFill!!
        }
        _ghostSmileFill = Builder(name = "GhostSmileFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(16.971f, 2.0f, 21.0f, 6.029f, 21.0f, 11.0f)
                verticalLineTo(18.5f)
                curveTo(21.0f, 20.433f, 19.433f, 22.0f, 17.5f, 22.0f)
                curveTo(16.3f, 22.0f, 15.241f, 21.396f, 14.611f, 20.476f)
                curveTo(14.098f, 21.386f, 13.12f, 22.0f, 12.0f, 22.0f)
                curveTo(10.88f, 22.0f, 9.902f, 21.386f, 9.387f, 20.475f)
                curveTo(8.759f, 21.396f, 7.7f, 22.0f, 6.5f, 22.0f)
                curveTo(4.631f, 22.0f, 3.105f, 20.536f, 3.005f, 18.692f)
                lineTo(3.0f, 18.5f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 6.029f, 7.029f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(16.0f, 13.0f)
                horizontalLineTo(14.0f)
                curveTo(14.0f, 14.105f, 13.105f, 15.0f, 12.0f, 15.0f)
                curveTo(10.946f, 15.0f, 10.082f, 14.184f, 10.005f, 13.149f)
                lineTo(10.0f, 13.0f)
                horizontalLineTo(8.0f)
                lineTo(8.005f, 13.2f)
                curveTo(8.109f, 15.316f, 9.858f, 17.0f, 12.0f, 17.0f)
                curveTo(14.142f, 17.0f, 15.891f, 15.316f, 15.995f, 13.2f)
                lineTo(16.0f, 13.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(10.895f, 7.0f, 10.0f, 7.895f, 10.0f, 9.0f)
                curveTo(10.0f, 10.105f, 10.895f, 11.0f, 12.0f, 11.0f)
                curveTo(13.105f, 11.0f, 14.0f, 10.105f, 14.0f, 9.0f)
                curveTo(14.0f, 7.895f, 13.105f, 7.0f, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return _ghostSmileFill!!
    }

private var _ghostSmileFill: ImageVector? = null
