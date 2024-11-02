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

public val OutlineGroup.BuildingOffice: ImageVector
    get() {
        if (_buildingOffice != null) {
            return _buildingOffice!!
        }
        _buildingOffice = Builder(name = "BuildingOffice", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.75f, 21.0f)
                horizontalLineTo(20.25f)
                moveTo(4.5f, 3.0f)
                horizontalLineTo(19.5f)
                moveTo(5.25f, 3.0f)
                verticalLineTo(21.0f)
                moveTo(18.75f, 3.0f)
                verticalLineTo(21.0f)
                moveTo(9.0f, 6.75f)
                horizontalLineTo(10.5f)
                moveTo(9.0f, 9.75f)
                horizontalLineTo(10.5f)
                moveTo(9.0f, 12.75f)
                horizontalLineTo(10.5f)
                moveTo(13.5f, 6.75f)
                horizontalLineTo(15.0f)
                moveTo(13.5f, 9.75f)
                horizontalLineTo(15.0f)
                moveTo(13.5f, 12.75f)
                horizontalLineTo(15.0f)
                moveTo(9.0f, 21.0f)
                verticalLineTo(17.625f)
                curveTo(9.0f, 17.004f, 9.504f, 16.5f, 10.125f, 16.5f)
                horizontalLineTo(13.875f)
                curveTo(14.496f, 16.5f, 15.0f, 17.004f, 15.0f, 17.625f)
                verticalLineTo(21.0f)
            }
        }
        .build()
        return _buildingOffice!!
    }

private var _buildingOffice: ImageVector? = null
