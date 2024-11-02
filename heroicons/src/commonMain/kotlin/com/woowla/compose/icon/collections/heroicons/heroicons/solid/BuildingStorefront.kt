package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.BuildingStorefront: ImageVector
    get() {
        if (_buildingStorefront != null) {
            return _buildingStorefront!!
        }
        _buildingStorefront = Builder(name = "BuildingStorefront", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.223f, 2.25f)
                curveTo(4.726f, 2.25f, 4.249f, 2.448f, 3.898f, 2.799f)
                lineTo(2.598f, 4.098f)
                curveTo(1.134f, 5.563f, 1.134f, 7.937f, 2.598f, 9.402f)
                curveTo(3.936f, 10.739f, 6.031f, 10.855f, 7.5f, 9.75f)
                curveTo(8.127f, 10.221f, 8.906f, 10.5f, 9.75f, 10.5f)
                curveTo(10.594f, 10.5f, 11.374f, 10.22f, 12.0f, 9.75f)
                curveTo(12.626f, 10.22f, 13.406f, 10.5f, 14.25f, 10.5f)
                curveTo(15.094f, 10.5f, 15.873f, 10.221f, 16.5f, 9.75f)
                curveTo(17.969f, 10.855f, 20.065f, 10.739f, 21.402f, 9.402f)
                curveTo(22.866f, 7.937f, 22.866f, 5.563f, 21.402f, 4.098f)
                lineTo(20.103f, 2.799f)
                curveTo(19.751f, 2.448f, 19.274f, 2.25f, 18.777f, 2.25f)
                lineTo(5.223f, 2.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 20.25f)
                verticalLineTo(11.495f)
                curveTo(4.42f, 12.169f, 6.08f, 12.168f, 7.5f, 11.494f)
                curveTo(8.183f, 11.818f, 8.946f, 12.0f, 9.75f, 12.0f)
                curveTo(10.554f, 12.0f, 11.318f, 11.818f, 12.0f, 11.494f)
                curveTo(12.682f, 11.818f, 13.446f, 12.0f, 14.25f, 12.0f)
                curveTo(15.054f, 12.0f, 15.817f, 11.818f, 16.5f, 11.494f)
                curveTo(17.92f, 12.168f, 19.58f, 12.169f, 21.0f, 11.495f)
                verticalLineTo(20.25f)
                horizontalLineTo(21.75f)
                curveTo(22.164f, 20.25f, 22.5f, 20.586f, 22.5f, 21.0f)
                curveTo(22.5f, 21.414f, 22.164f, 21.75f, 21.75f, 21.75f)
                horizontalLineTo(2.25f)
                curveTo(1.836f, 21.75f, 1.5f, 21.414f, 1.5f, 21.0f)
                curveTo(1.5f, 20.586f, 1.836f, 20.25f, 2.25f, 20.25f)
                horizontalLineTo(3.0f)
                close()
                moveTo(6.0f, 14.25f)
                curveTo(6.0f, 13.836f, 6.336f, 13.5f, 6.75f, 13.5f)
                horizontalLineTo(9.75f)
                curveTo(10.164f, 13.5f, 10.5f, 13.836f, 10.5f, 14.25f)
                verticalLineTo(17.25f)
                curveTo(10.5f, 17.664f, 10.164f, 18.0f, 9.75f, 18.0f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 18.0f, 6.0f, 17.664f, 6.0f, 17.25f)
                verticalLineTo(14.25f)
                close()
                moveTo(14.25f, 13.5f)
                curveTo(13.836f, 13.5f, 13.5f, 13.836f, 13.5f, 14.25f)
                verticalLineTo(19.5f)
                curveTo(13.5f, 19.914f, 13.836f, 20.25f, 14.25f, 20.25f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 20.25f, 18.0f, 19.914f, 18.0f, 19.5f)
                verticalLineTo(14.25f)
                curveTo(18.0f, 13.836f, 17.664f, 13.5f, 17.25f, 13.5f)
                horizontalLineTo(14.25f)
                close()
            }
        }
        .build()
        return _buildingStorefront!!
    }

private var _buildingStorefront: ImageVector? = null
