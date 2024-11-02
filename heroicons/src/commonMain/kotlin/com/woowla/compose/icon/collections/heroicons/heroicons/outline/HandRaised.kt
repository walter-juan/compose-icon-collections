package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.HandRaised: ImageVector
    get() {
        if (_handRaised != null) {
            return _handRaised!!
        }
        _handRaised = Builder(name = "HandRaised", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.05f, 4.575f)
                curveTo(10.05f, 3.705f, 9.345f, 3.0f, 8.475f, 3.0f)
                curveTo(7.605f, 3.0f, 6.9f, 3.705f, 6.9f, 4.575f)
                lineTo(6.9f, 7.575f)
                moveTo(10.05f, 4.575f)
                lineTo(10.05f, 3.075f)
                curveTo(10.05f, 2.205f, 10.755f, 1.5f, 11.625f, 1.5f)
                curveTo(12.495f, 1.5f, 13.2f, 2.205f, 13.2f, 3.075f)
                lineTo(13.2f, 4.575f)
                moveTo(10.05f, 4.575f)
                lineTo(10.125f, 10.5f)
                moveTo(13.2f, 11.25f)
                verticalLineTo(4.575f)
                moveTo(13.2f, 4.575f)
                curveTo(13.2f, 3.705f, 13.905f, 3.0f, 14.775f, 3.0f)
                curveTo(15.645f, 3.0f, 16.35f, 3.705f, 16.35f, 4.575f)
                verticalLineTo(15.0f)
                moveTo(6.9f, 7.575f)
                curveTo(6.9f, 6.705f, 6.195f, 6.0f, 5.325f, 6.0f)
                curveTo(4.455f, 6.0f, 3.75f, 6.705f, 3.75f, 7.575f)
                verticalLineTo(15.75f)
                curveTo(3.75f, 19.478f, 6.772f, 22.5f, 10.5f, 22.5f)
                horizontalLineTo(12.518f)
                curveTo(13.91f, 22.5f, 15.246f, 21.947f, 16.23f, 20.962f)
                lineTo(17.962f, 19.23f)
                curveTo(18.947f, 18.246f, 19.5f, 16.91f, 19.5f, 15.518f)
                lineTo(19.503f, 13.494f)
                curveTo(19.505f, 13.321f, 19.57f, 13.153f, 19.701f, 13.023f)
                curveTo(20.316f, 12.408f, 20.316f, 11.41f, 19.701f, 10.795f)
                curveTo(19.086f, 10.18f, 18.088f, 10.18f, 17.473f, 10.795f)
                curveTo(16.732f, 11.537f, 16.358f, 12.511f, 16.353f, 13.481f)
                moveTo(6.9f, 7.575f)
                verticalLineTo(12.0f)
                moveTo(13.17f, 16.318f)
                curveTo(13.56f, 15.928f, 14.003f, 15.625f, 14.477f, 15.408f)
                curveTo(15.07f, 15.136f, 15.71f, 15.0f, 16.35f, 15.0f)
                moveTo(16.352f, 15.0f)
                horizontalLineTo(16.35f)
            }
        }
        .build()
        return _handRaised!!
    }

private var _handRaised: ImageVector? = null
