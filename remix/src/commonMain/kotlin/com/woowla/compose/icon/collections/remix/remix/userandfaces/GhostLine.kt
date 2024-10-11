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

public val UserAndFacesGroup.GhostLine: ImageVector
    get() {
        if (_ghostLine != null) {
            return _ghostLine!!
        }
        _ghostLine = Builder(name = "GhostLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.0f, 4.0f)
                curveTo(8.215f, 4.0f, 5.131f, 7.005f, 5.004f, 10.759f)
                lineTo(5.0f, 11.0f)
                lineTo(4.999f, 18.446f)
                lineTo(5.002f, 18.584f)
                curveTo(5.045f, 19.375f, 5.703f, 20.0f, 6.5f, 20.0f)
                curveTo(6.952f, 20.0f, 7.367f, 19.801f, 7.647f, 19.465f)
                lineTo(7.735f, 19.348f)
                curveTo(8.57f, 18.125f, 10.399f, 18.202f, 11.128f, 19.49f)
                curveTo(11.305f, 19.804f, 11.634f, 20.0f, 12.0f, 20.0f)
                curveTo(12.365f, 20.0f, 12.693f, 19.804f, 12.869f, 19.493f)
                curveTo(13.569f, 18.252f, 15.29f, 18.132f, 16.164f, 19.215f)
                lineTo(16.261f, 19.346f)
                curveTo(16.54f, 19.753f, 16.998f, 20.0f, 17.5f, 20.0f)
                curveTo(18.28f, 20.0f, 18.92f, 19.405f, 18.993f, 18.645f)
                lineTo(19.0f, 18.5f)
                verticalLineTo(11.0f)
                curveTo(19.0f, 7.134f, 15.866f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(13.105f, 12.0f, 14.0f, 13.119f, 14.0f, 14.5f)
                curveTo(14.0f, 15.881f, 13.105f, 17.0f, 12.0f, 17.0f)
                curveTo(10.895f, 17.0f, 10.0f, 15.881f, 10.0f, 14.5f)
                curveTo(10.0f, 13.119f, 10.895f, 12.0f, 12.0f, 12.0f)
                close()
                moveTo(9.5f, 8.0f)
                curveTo(10.328f, 8.0f, 11.0f, 8.672f, 11.0f, 9.5f)
                curveTo(11.0f, 10.328f, 10.328f, 11.0f, 9.5f, 11.0f)
                curveTo(8.672f, 11.0f, 8.0f, 10.328f, 8.0f, 9.5f)
                curveTo(8.0f, 8.672f, 8.672f, 8.0f, 9.5f, 8.0f)
                close()
                moveTo(14.5f, 8.0f)
                curveTo(15.328f, 8.0f, 16.0f, 8.672f, 16.0f, 9.5f)
                curveTo(16.0f, 10.328f, 15.328f, 11.0f, 14.5f, 11.0f)
                curveTo(13.672f, 11.0f, 13.0f, 10.328f, 13.0f, 9.5f)
                curveTo(13.0f, 8.672f, 13.672f, 8.0f, 14.5f, 8.0f)
                close()
            }
        }
        .build()
        return _ghostLine!!
    }

private var _ghostLine: ImageVector? = null
