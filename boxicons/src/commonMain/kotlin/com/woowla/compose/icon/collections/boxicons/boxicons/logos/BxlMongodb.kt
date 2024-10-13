package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlMongodb: ImageVector
    get() {
        if (_bxlMongodb != null) {
            return _bxlMongodb!!
        }
        _bxlMongodb = Builder(name = "BxlMongodb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.74f, 4.23f)
                curveToRelative(-0.84f, -1.0f, -1.57f, -2.0f, -1.71f, -2.22f)
                horizontalLineTo(12.0f)
                curveToRelative(-0.14f, 0.21f, -0.87f, 1.22f, -1.71f, 2.22f)
                curveToRelative(-7.2f, 9.19f, 1.14f, 15.39f, 1.14f, 15.39f)
                lineToRelative(0.07f, 0.05f)
                curveToRelative(0.06f, 0.95f, 0.22f, 2.33f, 0.22f, 2.33f)
                horizontalLineToRelative(0.62f)
                reflectiveCurveToRelative(0.15f, -1.37f, 0.21f, -2.33f)
                lineToRelative(0.07f, -0.06f)
                reflectiveCurveToRelative(8.32f, -6.19f, 1.12f, -15.38f)
                close()
                moveTo(12.0f, 19.48f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, true, -0.48f, -0.48f)
                lineTo(12.0f, 9.0f)
                lineToRelative(0.45f, 10.0f)
                arcToRelative(3.57f, 3.57f, 0.0f, false, true, -0.45f, 0.48f)
                close()
            }
        }
        .build()
        return _bxlMongodb!!
    }

private var _bxlMongodb: ImageVector? = null
