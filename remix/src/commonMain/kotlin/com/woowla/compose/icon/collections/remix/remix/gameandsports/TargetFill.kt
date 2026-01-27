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

public val GameAndSportsGroup.TargetFill: ImageVector
    get() {
        if (_targetFill != null) {
            return _targetFill!!
        }
        _targetFill = Builder(name = "TargetFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(18.571f, 2.101f)
                curveTo(18.847f, 2.101f, 19.071f, 2.324f, 19.071f, 2.601f)
                verticalLineTo(4.43f)
                curveTo(19.072f, 4.706f, 19.295f, 4.929f, 19.571f, 4.929f)
                horizontalLineTo(21.399f)
                curveTo(21.675f, 4.929f, 21.899f, 5.153f, 21.899f, 5.429f)
                verticalLineTo(6.344f)
                lineTo(20.011f, 8.232f)
                curveTo(19.636f, 8.607f, 19.127f, 8.818f, 18.597f, 8.818f)
                horizontalLineTo(16.597f)
                lineTo(12.707f, 12.707f)
                curveTo(12.316f, 13.097f, 11.684f, 13.097f, 11.293f, 12.707f)
                curveTo(10.903f, 12.316f, 10.903f, 11.683f, 11.293f, 11.293f)
                lineTo(15.183f, 7.404f)
                verticalLineTo(5.404f)
                curveTo(15.183f, 4.874f, 15.393f, 4.365f, 15.768f, 3.99f)
                lineTo(17.657f, 2.101f)
                horizontalLineTo(18.571f)
                close()
            }
        }
        .build()
        return _targetFill!!
    }

private var _targetFill: ImageVector? = null
