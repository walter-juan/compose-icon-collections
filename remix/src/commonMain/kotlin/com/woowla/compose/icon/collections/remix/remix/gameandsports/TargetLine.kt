package com.woowla.compose.icon.collections.remix.remix.gameandsports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.GameAndSportsGroup

public val GameAndSportsGroup.TargetLine: ImageVector
    get() {
        if (_targetLine != null) {
            return _targetLine!!
        }
        _targetLine = Builder(name = "TargetLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(12.552f, 2.0f, 13.0f, 2.448f, 13.0f, 3.0f)
                curveTo(13.0f, 3.552f, 12.552f, 4.0f, 12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f)
                curveTo(20.0f, 11.448f, 20.448f, 11.0f, 21.0f, 11.0f)
                curveTo(21.552f, 11.0f, 22.0f, 11.448f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveTo(12.552f, 6.0f, 13.0f, 6.448f, 13.0f, 7.0f)
                curveTo(13.0f, 7.552f, 12.552f, 8.0f, 12.0f, 8.0f)
                curveTo(9.791f, 8.0f, 8.0f, 9.791f, 8.0f, 12.0f)
                curveTo(8.0f, 14.209f, 9.791f, 16.0f, 12.0f, 16.0f)
                curveTo(14.209f, 16.0f, 16.0f, 14.209f, 16.0f, 12.0f)
                curveTo(16.0f, 11.448f, 16.448f, 11.0f, 17.0f, 11.0f)
                curveTo(17.552f, 11.0f, 18.0f, 11.448f, 18.0f, 12.0f)
                curveTo(18.0f, 15.314f, 15.314f, 18.0f, 12.0f, 18.0f)
                curveTo(8.686f, 18.0f, 6.0f, 15.314f, 6.0f, 12.0f)
                curveTo(6.0f, 8.686f, 8.686f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(17.656f, 2.101f)
                curveTo(18.047f, 1.71f, 18.681f, 1.71f, 19.071f, 2.101f)
                curveTo(19.461f, 2.491f, 19.462f, 3.124f, 19.071f, 3.515f)
                lineTo(18.363f, 4.221f)
                lineTo(18.364f, 4.222f)
                curveTo(17.974f, 4.612f, 17.974f, 5.245f, 18.364f, 5.636f)
                curveTo(18.755f, 6.026f, 19.388f, 6.026f, 19.778f, 5.636f)
                lineTo(20.485f, 4.929f)
                curveTo(20.876f, 4.538f, 21.509f, 4.538f, 21.899f, 4.929f)
                curveTo(22.29f, 5.319f, 22.29f, 5.952f, 21.899f, 6.343f)
                lineTo(19.778f, 8.465f)
                curveTo(19.591f, 8.652f, 19.336f, 8.757f, 19.071f, 8.757f)
                horizontalLineTo(16.657f)
                lineTo(12.707f, 12.707f)
                curveTo(12.316f, 13.097f, 11.683f, 13.097f, 11.293f, 12.707f)
                curveTo(10.903f, 12.316f, 10.903f, 11.684f, 11.293f, 11.293f)
                lineTo(15.242f, 7.344f)
                verticalLineTo(4.929f)
                curveTo(15.242f, 4.664f, 15.348f, 4.409f, 15.535f, 4.222f)
                lineTo(17.656f, 2.101f)
                close()
            }
        }
        .build()
        return _targetLine!!
    }

private var _targetLine: ImageVector? = null
