package com.woowla.compose.icon.collections.devicons.devicons.elasticsearch

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.woowla.compose.icon.collections.devicons.devicons.ElasticsearchGroup

public val ElasticsearchGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF343741)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 64.0f)
                curveToRelative(0.0f, 5.53f, 0.78f, 10.88f, 2.1f, 16.0f)
                horizontalLineTo(84.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.16f, -16.0f, -16.0f, -16.0f)
                horizontalLineTo(6.1f)
                arcTo(63.74f, 63.74f, 0.0f, false, false, 4.0f, 64.0f)
            }
            path(fill = SolidColor(Color(0xFFfec514)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(111.69f, 30.65f)
                arcTo(61.49f, 61.49f, 0.0f, false, false, 117.92f, 24.0f)
                curveTo(106.19f, 9.38f, 88.2f, 0.0f, 68.0f, 0.0f)
                curveTo(42.72f, 0.0f, 20.96f, 14.71f, 10.57f, 36.0f)
                horizontalLineTo(98.04f)
                arcToRelative(20.12f, 20.12f, 0.0f, false, false, 13.65f, -5.35f)
            }
            path(fill = SolidColor(Color(0xFF00bfb3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(98.04f, 92.0f)
                horizontalLineTo(10.58f)
                curveTo(20.96f, 113.29f, 42.72f, 128.0f, 68.0f, 128.0f)
                curveToRelative(20.2f, 0.0f, 38.19f, -9.38f, 49.92f, -24.0f)
                arcToRelative(61.1f, 61.1f, 0.0f, false, false, -6.23f, -6.65f)
                arcTo(20.13f, 20.13f, 0.0f, false, false, 98.04f, 92.0f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
