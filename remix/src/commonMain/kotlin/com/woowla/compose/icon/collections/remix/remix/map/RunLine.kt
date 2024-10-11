package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.RunLine: ImageVector
    get() {
        if (_runLine != null) {
            return _runLine!!
        }
        _runLine = Builder(name = "RunLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.83f, 8.79f)
                lineTo(8.0f, 9.456f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.05f)
                horizontalLineTo(6.015f)
                lineTo(11.283f, 6.132f)
                curveTo(11.527f, 6.039f, 11.792f, 5.992f, 12.065f, 6.001f)
                curveTo(13.176f, 6.028f, 14.152f, 6.757f, 14.492f, 7.82f)
                curveTo(14.678f, 8.404f, 14.848f, 8.798f, 15.002f, 9.002f)
                curveTo(15.914f, 10.215f, 17.365f, 11.0f, 19.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(16.825f, 13.0f, 14.882f, 12.008f, 13.598f, 10.453f)
                lineTo(12.901f, 14.408f)
                lineTo(15.0f, 16.17f)
                verticalLineTo(23.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.103f)
                lineTo(10.731f, 15.198f)
                lineTo(10.003f, 19.325f)
                lineTo(3.109f, 18.11f)
                lineTo(3.457f, 16.14f)
                lineTo(8.381f, 17.008f)
                lineTo(9.83f, 8.79f)
                close()
                moveTo(13.5f, 5.5f)
                curveTo(12.395f, 5.5f, 11.5f, 4.605f, 11.5f, 3.5f)
                curveTo(11.5f, 2.395f, 12.395f, 1.5f, 13.5f, 1.5f)
                curveTo(14.605f, 1.5f, 15.5f, 2.395f, 15.5f, 3.5f)
                curveTo(15.5f, 4.605f, 14.605f, 5.5f, 13.5f, 5.5f)
                close()
            }
        }
        .build()
        return _runLine!!
    }

private var _runLine: ImageVector? = null
