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

public val OutlineGroup.BuildingStorefront: ImageVector
    get() {
        if (_buildingStorefront != null) {
            return _buildingStorefront!!
        }
        _buildingStorefront = Builder(name = "BuildingStorefront", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 21.0f)
                verticalLineTo(13.5f)
                curveTo(13.5f, 13.086f, 13.836f, 12.75f, 14.25f, 12.75f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 12.75f, 18.0f, 13.086f, 18.0f, 13.5f)
                verticalLineTo(21.0f)
                moveTo(13.5f, 21.0f)
                horizontalLineTo(2.361f)
                moveTo(13.5f, 21.0f)
                horizontalLineTo(18.0f)
                moveTo(18.0f, 21.0f)
                horizontalLineTo(21.639f)
                moveTo(20.25f, 21.0f)
                verticalLineTo(9.349f)
                moveTo(3.75f, 21.0f)
                verticalLineTo(9.349f)
                moveTo(3.75f, 9.349f)
                curveTo(4.897f, 10.012f, 6.39f, 9.853f, 7.371f, 8.871f)
                curveTo(7.416f, 8.827f, 7.459f, 8.781f, 7.5f, 8.734f)
                curveTo(8.05f, 9.357f, 8.854f, 9.75f, 9.75f, 9.75f)
                curveTo(10.646f, 9.75f, 11.45f, 9.357f, 12.0f, 8.734f)
                curveTo(12.55f, 9.357f, 13.354f, 9.75f, 14.25f, 9.75f)
                curveTo(15.146f, 9.75f, 15.95f, 9.357f, 16.5f, 8.735f)
                curveTo(16.541f, 8.781f, 16.584f, 8.827f, 16.628f, 8.871f)
                curveTo(17.61f, 9.853f, 19.103f, 10.012f, 20.25f, 9.349f)
                moveTo(3.75f, 9.349f)
                curveTo(3.528f, 9.221f, 3.319f, 9.061f, 3.129f, 8.871f)
                curveTo(1.957f, 7.7f, 1.957f, 5.8f, 3.129f, 4.629f)
                lineTo(4.318f, 3.439f)
                curveTo(4.599f, 3.158f, 4.981f, 3.0f, 5.379f, 3.0f)
                horizontalLineTo(18.621f)
                curveTo(19.019f, 3.0f, 19.4f, 3.158f, 19.682f, 3.439f)
                lineTo(20.871f, 4.629f)
                curveTo(22.043f, 5.8f, 22.043f, 7.7f, 20.871f, 8.871f)
                curveTo(20.681f, 9.061f, 20.472f, 9.22f, 20.25f, 9.349f)
                moveTo(6.75f, 18.0f)
                horizontalLineTo(10.5f)
                curveTo(10.914f, 18.0f, 11.25f, 17.664f, 11.25f, 17.25f)
                verticalLineTo(13.5f)
                curveTo(11.25f, 13.086f, 10.914f, 12.75f, 10.5f, 12.75f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 12.75f, 6.0f, 13.086f, 6.0f, 13.5f)
                verticalLineTo(17.25f)
                curveTo(6.0f, 17.664f, 6.336f, 18.0f, 6.75f, 18.0f)
                close()
            }
        }
        .build()
        return _buildingStorefront!!
    }

private var _buildingStorefront: ImageVector? = null
