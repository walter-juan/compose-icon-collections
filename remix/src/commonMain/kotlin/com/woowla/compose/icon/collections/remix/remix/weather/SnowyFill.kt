package com.woowla.compose.icon.collections.remix.remix.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.WeatherGroup

public val WeatherGroup.SnowyFill: ImageVector
    get() {
        if (_snowyFill != null) {
            return _snowyFill!!
        }
        _snowyFill = Builder(name = "SnowyFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.027f, 17.429f)
                curveTo(3.081f, 16.249f, 1.0f, 13.368f, 1.0f, 10.0f)
                curveTo(1.0f, 5.582f, 4.582f, 2.0f, 9.0f, 2.0f)
                curveTo(12.395f, 2.0f, 15.296f, 4.115f, 16.458f, 7.099f)
                curveTo(16.795f, 7.034f, 17.144f, 7.0f, 17.5f, 7.0f)
                curveTo(20.538f, 7.0f, 23.0f, 9.462f, 23.0f, 12.5f)
                curveTo(23.0f, 15.369f, 20.803f, 17.725f, 18.0f, 17.978f)
                curveTo(17.988f, 14.674f, 15.306f, 12.0f, 12.0f, 12.0f)
                curveTo(8.879f, 12.0f, 6.314f, 14.383f, 6.027f, 17.429f)
                close()
                moveTo(13.0f, 16.268f)
                lineTo(14.964f, 15.134f)
                lineTo(15.964f, 16.866f)
                lineTo(14.0f, 18.0f)
                lineTo(15.964f, 19.134f)
                lineTo(14.964f, 20.866f)
                lineTo(13.0f, 19.732f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.732f)
                lineTo(9.036f, 20.866f)
                lineTo(8.036f, 19.134f)
                lineTo(10.0f, 18.0f)
                lineTo(8.036f, 16.866f)
                lineTo(9.036f, 15.134f)
                lineTo(11.0f, 16.268f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.268f)
                close()
            }
        }
        .build()
        return _snowyFill!!
    }

private var _snowyFill: ImageVector? = null
