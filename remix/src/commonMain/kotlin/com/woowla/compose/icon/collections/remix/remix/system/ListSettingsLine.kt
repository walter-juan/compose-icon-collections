package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.ListSettingsLine: ImageVector
    get() {
        if (_listSettingsLine != null) {
            return _listSettingsLine!!
        }
        _listSettingsLine = Builder(name = "ListSettingsLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(2.0f, 11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(2.0f, 4.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(20.674f, 13.025f)
                lineTo(21.83f, 12.634f)
                lineTo(22.83f, 14.366f)
                lineTo(21.914f, 15.171f)
                curveTo(21.97f, 15.439f, 22.0f, 15.716f, 22.0f, 16.0f)
                curveTo(22.0f, 16.284f, 21.97f, 16.561f, 21.914f, 16.829f)
                lineTo(22.83f, 17.634f)
                lineTo(21.83f, 19.366f)
                lineTo(20.674f, 18.975f)
                curveTo(20.264f, 19.344f, 19.776f, 19.629f, 19.239f, 19.804f)
                lineTo(19.0f, 21.0f)
                horizontalLineTo(17.0f)
                lineTo(16.761f, 19.804f)
                curveTo(16.224f, 19.629f, 15.736f, 19.344f, 15.326f, 18.975f)
                lineTo(14.17f, 19.366f)
                lineTo(13.17f, 17.634f)
                lineTo(14.086f, 16.829f)
                curveTo(14.03f, 16.561f, 14.0f, 16.284f, 14.0f, 16.0f)
                curveTo(14.0f, 15.716f, 14.03f, 15.439f, 14.086f, 15.171f)
                lineTo(13.17f, 14.366f)
                lineTo(14.17f, 12.634f)
                lineTo(15.326f, 13.025f)
                curveTo(15.736f, 12.656f, 16.224f, 12.37f, 16.761f, 12.196f)
                lineTo(17.0f, 11.0f)
                horizontalLineTo(19.0f)
                lineTo(19.239f, 12.196f)
                curveTo(19.776f, 12.37f, 20.264f, 12.656f, 20.674f, 13.025f)
                close()
                moveTo(18.0f, 18.0f)
                curveTo(19.105f, 18.0f, 20.0f, 17.105f, 20.0f, 16.0f)
                curveTo(20.0f, 14.895f, 19.105f, 14.0f, 18.0f, 14.0f)
                curveTo(16.895f, 14.0f, 16.0f, 14.895f, 16.0f, 16.0f)
                curveTo(16.0f, 17.105f, 16.895f, 18.0f, 18.0f, 18.0f)
                close()
            }
        }
        .build()
        return _listSettingsLine!!
    }

private var _listSettingsLine: ImageVector? = null
