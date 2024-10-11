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

public val OthersGroup.LightbulbFlashLine: ImageVector
    get() {
        if (_lightbulbFlashLine != null) {
            return _lightbulbFlashLine!!
        }
        _lightbulbFlashLine = Builder(name = "LightbulbFlashLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.973f, 18.0f)
                horizontalLineTo(14.027f)
                curveTo(14.159f, 16.798f, 14.772f, 15.807f, 15.768f, 14.723f)
                curveTo(15.88f, 14.601f, 16.599f, 13.856f, 16.684f, 13.75f)
                curveTo(17.532f, 12.693f, 18.0f, 11.385f, 18.0f, 10.0f)
                curveTo(18.0f, 6.686f, 15.314f, 4.0f, 12.0f, 4.0f)
                curveTo(8.686f, 4.0f, 6.0f, 6.686f, 6.0f, 10.0f)
                curveTo(6.0f, 11.384f, 6.468f, 12.692f, 7.315f, 13.748f)
                curveTo(7.4f, 13.855f, 8.121f, 14.601f, 8.232f, 14.722f)
                curveTo(9.228f, 15.806f, 9.841f, 16.798f, 9.973f, 18.0f)
                close()
                moveTo(14.0f, 20.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(5.754f, 14.999f)
                curveTo(4.656f, 13.63f, 4.0f, 11.892f, 4.0f, 10.0f)
                curveTo(4.0f, 5.582f, 7.582f, 2.0f, 12.0f, 2.0f)
                curveTo(16.418f, 2.0f, 20.0f, 5.582f, 20.0f, 10.0f)
                curveTo(20.0f, 11.892f, 19.343f, 13.632f, 18.244f, 15.001f)
                curveTo(17.624f, 15.775f, 16.0f, 17.0f, 16.0f, 18.5f)
                verticalLineTo(21.0f)
                curveTo(16.0f, 22.105f, 15.105f, 23.0f, 14.0f, 23.0f)
                horizontalLineTo(10.0f)
                curveTo(8.895f, 23.0f, 8.0f, 22.105f, 8.0f, 21.0f)
                verticalLineTo(18.5f)
                curveTo(8.0f, 17.0f, 6.375f, 15.774f, 5.754f, 14.999f)
                close()
                moveTo(13.0f, 10.005f)
                horizontalLineTo(15.5f)
                lineTo(11.0f, 16.005f)
                verticalLineTo(12.005f)
                horizontalLineTo(8.5f)
                lineTo(13.0f, 6.0f)
                verticalLineTo(10.005f)
                close()
            }
        }
        .build()
        return _lightbulbFlashLine!!
    }

private var _lightbulbFlashLine: ImageVector? = null
