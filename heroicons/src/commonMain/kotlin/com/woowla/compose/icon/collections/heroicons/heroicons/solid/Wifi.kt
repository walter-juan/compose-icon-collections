package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Wifi: ImageVector
    get() {
        if (_wifi != null) {
            return _wifi!!
        }
        _wifi = Builder(name = "Wifi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.371f, 8.143f)
                curveTo(7.229f, 2.286f, 16.727f, 2.286f, 22.584f, 8.143f)
                curveTo(22.877f, 8.436f, 22.877f, 8.911f, 22.584f, 9.204f)
                lineTo(22.054f, 9.734f)
                curveTo(21.913f, 9.875f, 21.723f, 9.954f, 21.524f, 9.954f)
                curveTo(21.325f, 9.954f, 21.134f, 9.875f, 20.993f, 9.734f)
                curveTo(16.014f, 4.755f, 7.941f, 4.755f, 2.962f, 9.734f)
                curveTo(2.822f, 9.875f, 2.631f, 9.954f, 2.432f, 9.954f)
                curveTo(2.233f, 9.954f, 2.042f, 9.875f, 1.902f, 9.734f)
                lineTo(1.371f, 9.204f)
                curveTo(1.078f, 8.911f, 1.078f, 8.436f, 1.371f, 8.143f)
                close()
                moveTo(4.553f, 11.325f)
                curveTo(8.654f, 7.225f, 15.302f, 7.225f, 19.403f, 11.325f)
                curveTo(19.695f, 11.618f, 19.695f, 12.093f, 19.403f, 12.386f)
                lineTo(18.872f, 12.916f)
                curveTo(18.732f, 13.057f, 18.541f, 13.136f, 18.342f, 13.136f)
                curveTo(18.143f, 13.136f, 17.952f, 13.057f, 17.812f, 12.916f)
                curveTo(14.59f, 9.695f, 9.366f, 9.695f, 6.144f, 12.916f)
                curveTo(5.851f, 13.209f, 5.377f, 13.209f, 5.084f, 12.916f)
                lineTo(4.553f, 12.386f)
                curveTo(4.413f, 12.245f, 4.334f, 12.055f, 4.334f, 11.856f)
                curveTo(4.334f, 11.657f, 4.413f, 11.466f, 4.553f, 11.325f)
                close()
                moveTo(7.757f, 14.507f)
                curveTo(10.101f, 12.164f, 13.899f, 12.164f, 16.243f, 14.507f)
                curveTo(16.535f, 14.8f, 16.535f, 15.275f, 16.243f, 15.568f)
                lineTo(15.712f, 16.098f)
                curveTo(15.572f, 16.239f, 15.381f, 16.318f, 15.182f, 16.318f)
                curveTo(14.983f, 16.318f, 14.792f, 16.239f, 14.652f, 16.098f)
                curveTo(13.187f, 14.634f, 10.813f, 14.634f, 9.348f, 16.098f)
                curveTo(9.055f, 16.391f, 8.581f, 16.391f, 8.288f, 16.098f)
                lineTo(7.757f, 15.568f)
                curveTo(7.464f, 15.275f, 7.464f, 14.8f, 7.757f, 14.507f)
                close()
                moveTo(10.939f, 17.689f)
                curveTo(11.525f, 17.104f, 12.475f, 17.104f, 13.061f, 17.689f)
                curveTo(13.354f, 17.982f, 13.354f, 18.457f, 13.061f, 18.75f)
                lineTo(12.53f, 19.28f)
                curveTo(12.39f, 19.421f, 12.199f, 19.5f, 12.0f, 19.5f)
                curveTo(11.801f, 19.5f, 11.61f, 19.421f, 11.47f, 19.28f)
                lineTo(10.939f, 18.75f)
                curveTo(10.646f, 18.457f, 10.646f, 17.982f, 10.939f, 17.689f)
                close()
            }
        }
        .build()
        return _wifi!!
    }

private var _wifi: ImageVector? = null
