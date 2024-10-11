package com.woowla.compose.icon.collections.remix.remix.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BuildingsGroup

public val BuildingsGroup.HomeGearFill: ImageVector
    get() {
        if (_homeGearFill != null) {
            return _homeGearFill!!
        }
        _homeGearFill = Builder(name = "HomeGearFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 20.0f)
                curveTo(20.0f, 20.552f, 19.552f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 21.0f, 4.0f, 20.552f, 4.0f, 20.0f)
                verticalLineTo(11.0f)
                lineTo(1.0f, 11.0f)
                lineTo(11.327f, 1.612f)
                curveTo(11.709f, 1.265f, 12.291f, 1.265f, 12.673f, 1.612f)
                lineTo(23.0f, 11.0f)
                lineTo(20.0f, 11.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(8.592f, 13.808f)
                lineTo(7.601f, 14.38f)
                lineTo(8.602f, 16.113f)
                lineTo(9.594f, 15.54f)
                curveTo(9.988f, 15.912f, 10.467f, 16.193f, 10.999f, 16.351f)
                verticalLineTo(17.496f)
                horizontalLineTo(13.001f)
                verticalLineTo(16.351f)
                curveTo(13.533f, 16.193f, 14.012f, 15.911f, 14.406f, 15.54f)
                lineTo(15.398f, 16.113f)
                lineTo(16.399f, 14.38f)
                lineTo(15.408f, 13.808f)
                curveTo(15.47f, 13.548f, 15.502f, 13.277f, 15.502f, 12.998f)
                curveTo(15.502f, 12.719f, 15.47f, 12.448f, 15.408f, 12.188f)
                lineTo(16.399f, 11.615f)
                lineTo(15.398f, 9.882f)
                lineTo(14.406f, 10.455f)
                curveTo(14.012f, 10.084f, 13.533f, 9.803f, 13.001f, 9.644f)
                verticalLineTo(8.5f)
                horizontalLineTo(10.999f)
                verticalLineTo(9.644f)
                curveTo(10.467f, 9.803f, 9.987f, 10.084f, 9.594f, 10.455f)
                lineTo(8.602f, 9.882f)
                lineTo(7.601f, 11.616f)
                lineTo(8.592f, 12.188f)
                curveTo(8.53f, 12.448f, 8.498f, 12.719f, 8.498f, 12.998f)
                curveTo(8.498f, 13.277f, 8.53f, 13.548f, 8.592f, 13.808f)
                close()
                moveTo(12.0f, 14.497f)
                curveTo(11.171f, 14.497f, 10.499f, 13.826f, 10.499f, 12.998f)
                curveTo(10.499f, 12.17f, 11.171f, 11.498f, 12.0f, 11.498f)
                curveTo(12.829f, 11.498f, 13.501f, 12.17f, 13.501f, 12.998f)
                curveTo(13.501f, 13.826f, 12.829f, 14.497f, 12.0f, 14.497f)
                close()
            }
        }
        .build()
        return _homeGearFill!!
    }

private var _homeGearFill: ImageVector? = null
