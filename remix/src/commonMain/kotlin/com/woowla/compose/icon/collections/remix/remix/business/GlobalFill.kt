package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.GlobalFill: ImageVector
    get() {
        if (_globalFill != null) {
            return _globalFill!!
        }
        _globalFill = Builder(name = "GlobalFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.049f, 13.0f)
                horizontalLineTo(7.527f)
                curveTo(7.706f, 16.269f, 8.757f, 19.305f, 10.452f, 21.881f)
                curveTo(5.988f, 21.187f, 2.5f, 17.54f, 2.049f, 13.0f)
                close()
                moveTo(2.049f, 11.0f)
                curveTo(2.5f, 6.46f, 5.988f, 2.813f, 10.452f, 2.119f)
                curveTo(8.757f, 4.695f, 7.706f, 7.731f, 7.527f, 11.0f)
                horizontalLineTo(2.049f)
                close()
                moveTo(21.951f, 11.0f)
                horizontalLineTo(16.473f)
                curveTo(16.294f, 7.731f, 15.243f, 4.695f, 13.548f, 2.119f)
                curveTo(18.012f, 2.813f, 21.5f, 6.46f, 21.951f, 11.0f)
                close()
                moveTo(21.951f, 13.0f)
                curveTo(21.5f, 17.54f, 18.012f, 21.187f, 13.548f, 21.881f)
                curveTo(15.243f, 19.305f, 16.294f, 16.269f, 16.473f, 13.0f)
                horizontalLineTo(21.951f)
                close()
                moveTo(9.531f, 13.0f)
                horizontalLineTo(14.469f)
                curveTo(14.298f, 15.783f, 13.415f, 18.373f, 12.0f, 20.591f)
                curveTo(10.585f, 18.373f, 9.702f, 15.783f, 9.531f, 13.0f)
                close()
                moveTo(9.531f, 11.0f)
                curveTo(9.702f, 8.217f, 10.585f, 5.627f, 12.0f, 3.408f)
                curveTo(13.415f, 5.627f, 14.298f, 8.217f, 14.469f, 11.0f)
                horizontalLineTo(9.531f)
                close()
            }
        }
        .build()
        return _globalFill!!
    }

private var _globalFill: ImageVector? = null
