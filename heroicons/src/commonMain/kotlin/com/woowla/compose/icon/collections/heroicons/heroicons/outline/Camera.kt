package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.827f, 6.175f)
                curveTo(6.466f, 6.754f, 5.861f, 7.134f, 5.186f, 7.23f)
                curveTo(4.807f, 7.284f, 4.429f, 7.342f, 4.052f, 7.405f)
                curveTo(2.999f, 7.58f, 2.25f, 8.507f, 2.25f, 9.574f)
                verticalLineTo(18.0f)
                curveTo(2.25f, 19.243f, 3.257f, 20.25f, 4.5f, 20.25f)
                horizontalLineTo(19.5f)
                curveTo(20.743f, 20.25f, 21.75f, 19.243f, 21.75f, 18.0f)
                verticalLineTo(9.574f)
                curveTo(21.75f, 8.507f, 21.001f, 7.58f, 19.948f, 7.405f)
                curveTo(19.572f, 7.342f, 19.193f, 7.284f, 18.814f, 7.23f)
                curveTo(18.139f, 7.134f, 17.534f, 6.754f, 17.173f, 6.175f)
                lineTo(16.352f, 4.859f)
                curveTo(15.973f, 4.252f, 15.329f, 3.858f, 14.616f, 3.82f)
                curveTo(13.75f, 3.774f, 12.877f, 3.75f, 12.0f, 3.75f)
                curveTo(11.123f, 3.75f, 10.25f, 3.774f, 9.384f, 3.82f)
                curveTo(8.671f, 3.858f, 8.027f, 4.252f, 7.648f, 4.859f)
                lineTo(6.827f, 6.175f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 12.75f)
                curveTo(16.5f, 15.235f, 14.485f, 17.25f, 12.0f, 17.25f)
                curveTo(9.515f, 17.25f, 7.5f, 15.235f, 7.5f, 12.75f)
                curveTo(7.5f, 10.265f, 9.515f, 8.25f, 12.0f, 8.25f)
                curveTo(14.485f, 8.25f, 16.5f, 10.265f, 16.5f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.75f, 10.5f)
                horizontalLineTo(18.757f)
                verticalLineTo(10.507f)
                horizontalLineTo(18.75f)
                verticalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null
