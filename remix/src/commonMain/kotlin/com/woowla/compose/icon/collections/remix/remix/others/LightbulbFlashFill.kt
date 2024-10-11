package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.LightbulbFlashFill: ImageVector
    get() {
        if (_lightbulbFlashFill != null) {
            return _lightbulbFlashFill!!
        }
        _lightbulbFlashFill = Builder(name = "LightbulbFlashFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.941f, 18.0f)
                curveTo(7.644f, 16.727f, 6.304f, 15.686f, 5.754f, 14.999f)
                curveTo(4.656f, 13.63f, 4.0f, 11.892f, 4.0f, 10.0f)
                curveTo(4.0f, 5.582f, 7.582f, 2.0f, 12.0f, 2.0f)
                curveTo(16.418f, 2.0f, 20.0f, 5.582f, 20.0f, 10.0f)
                curveTo(20.0f, 11.892f, 19.343f, 13.632f, 18.244f, 15.001f)
                curveTo(17.694f, 15.687f, 16.356f, 16.728f, 16.059f, 18.0f)
                horizontalLineTo(7.941f)
                close()
                moveTo(16.0f, 20.0f)
                verticalLineTo(21.0f)
                curveTo(16.0f, 22.105f, 15.105f, 23.0f, 14.0f, 23.0f)
                horizontalLineTo(10.0f)
                curveTo(8.895f, 23.0f, 8.0f, 22.105f, 8.0f, 21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(13.0f, 10.005f)
                verticalLineTo(6.0f)
                lineTo(8.5f, 12.005f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.005f)
                lineTo(15.5f, 10.005f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _lightbulbFlashFill!!
    }

private var _lightbulbFlashFill: ImageVector? = null
