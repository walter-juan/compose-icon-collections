package com.woowla.compose.icon.collections.heroicons.heroicons.solid

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
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Truck: ImageVector
    get() {
        if (_truck != null) {
            return _truck!!
        }
        _truck = Builder(name = "Truck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.375f, 4.5f)
                curveTo(2.339f, 4.5f, 1.5f, 5.339f, 1.5f, 6.375f)
                verticalLineTo(13.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(6.375f)
                curveTo(13.5f, 5.339f, 12.66f, 4.5f, 11.625f, 4.5f)
                horizontalLineTo(3.375f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 15.0f)
                horizontalLineTo(1.5f)
                verticalLineTo(17.625f)
                curveTo(1.5f, 18.66f, 2.339f, 19.5f, 3.375f, 19.5f)
                horizontalLineTo(3.75f)
                curveTo(3.75f, 17.843f, 5.093f, 16.5f, 6.75f, 16.5f)
                curveTo(8.407f, 16.5f, 9.75f, 17.843f, 9.75f, 19.5f)
                horizontalLineTo(12.75f)
                curveTo(13.164f, 19.5f, 13.5f, 19.164f, 13.5f, 18.75f)
                verticalLineTo(15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.25f, 19.5f)
                curveTo(8.25f, 18.672f, 7.578f, 18.0f, 6.75f, 18.0f)
                curveTo(5.922f, 18.0f, 5.25f, 18.672f, 5.25f, 19.5f)
                curveTo(5.25f, 20.328f, 5.922f, 21.0f, 6.75f, 21.0f)
                curveTo(7.578f, 21.0f, 8.25f, 20.328f, 8.25f, 19.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 6.75f)
                curveTo(15.336f, 6.75f, 15.0f, 7.086f, 15.0f, 7.5f)
                verticalLineTo(18.75f)
                curveTo(15.0f, 18.837f, 15.015f, 18.92f, 15.042f, 18.998f)
                curveTo(15.281f, 17.58f, 16.514f, 16.5f, 18.0f, 16.5f)
                curveTo(19.644f, 16.5f, 20.979f, 17.823f, 21.0f, 19.462f)
                curveTo(21.853f, 19.287f, 22.522f, 18.527f, 22.464f, 17.579f)
                curveTo(22.231f, 13.799f, 20.878f, 10.321f, 18.732f, 7.475f)
                curveTo(18.378f, 7.005f, 17.826f, 6.75f, 17.262f, 6.75f)
                horizontalLineTo(15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 19.5f)
                curveTo(19.5f, 18.672f, 18.828f, 18.0f, 18.0f, 18.0f)
                curveTo(17.172f, 18.0f, 16.5f, 18.672f, 16.5f, 19.5f)
                curveTo(16.5f, 20.328f, 17.172f, 21.0f, 18.0f, 21.0f)
                curveTo(18.828f, 21.0f, 19.5f, 20.328f, 19.5f, 19.5f)
                close()
            }
        }
        .build()
        return _truck!!
    }

private var _truck: ImageVector? = null
