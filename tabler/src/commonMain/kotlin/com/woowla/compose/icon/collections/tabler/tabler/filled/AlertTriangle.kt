package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.AlertTriangle: ImageVector
    get() {
        if (_alertTriangle != null) {
            return _alertTriangle!!
        }
        _alertTriangle = Builder(name = "AlertTriangle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.67f)
                curveToRelative(0.955f, 0.0f, 1.845f, 0.467f, 2.39f, 1.247f)
                lineToRelative(0.105f, 0.16f)
                lineToRelative(8.114f, 13.548f)
                arcToRelative(2.914f, 2.914f, 0.0f, false, true, -2.307f, 4.363f)
                lineToRelative(-0.195f, 0.008f)
                horizontalLineToRelative(-16.225f)
                arcToRelative(2.914f, 2.914f, 0.0f, false, true, -2.582f, -4.2f)
                lineToRelative(0.099f, -0.185f)
                lineToRelative(8.11f, -13.538f)
                arcToRelative(2.914f, 2.914f, 0.0f, false, true, 2.491f, -1.403f)
                close()
                moveTo(12.01f, 15.0f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.986f)
                lineToRelative(0.117f, 0.007f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.986f)
                lineToRelative(-0.117f, -0.007f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                verticalLineToRelative(4.0f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.986f, 0.0f)
                lineToRelative(0.007f, -0.117f)
                verticalLineToRelative(-4.0f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, -0.883f)
                close()
            }
        }
        .build()
        return _alertTriangle!!
    }

private var _alertTriangle: ImageVector? = null
