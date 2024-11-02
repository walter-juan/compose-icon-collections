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

public val SolidGroup.Users: ImageVector
    get() {
        if (_users != null) {
            return _users!!
        }
        _users = Builder(name = "Users", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 6.375f)
                curveTo(4.5f, 4.097f, 6.347f, 2.25f, 8.625f, 2.25f)
                curveTo(10.903f, 2.25f, 12.75f, 4.097f, 12.75f, 6.375f)
                curveTo(12.75f, 8.653f, 10.903f, 10.5f, 8.625f, 10.5f)
                curveTo(6.347f, 10.5f, 4.5f, 8.653f, 4.5f, 6.375f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.25f, 8.625f)
                curveTo(14.25f, 6.761f, 15.761f, 5.25f, 17.625f, 5.25f)
                curveTo(19.489f, 5.25f, 21.0f, 6.761f, 21.0f, 8.625f)
                curveTo(21.0f, 10.489f, 19.489f, 12.0f, 17.625f, 12.0f)
                curveTo(15.761f, 12.0f, 14.25f, 10.489f, 14.25f, 8.625f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 19.125f)
                curveTo(1.5f, 15.19f, 4.69f, 12.0f, 8.625f, 12.0f)
                curveTo(12.56f, 12.0f, 15.75f, 15.19f, 15.75f, 19.125f)
                verticalLineTo(19.128f)
                curveTo(15.75f, 19.167f, 15.75f, 19.207f, 15.749f, 19.247f)
                curveTo(15.745f, 19.505f, 15.607f, 19.743f, 15.386f, 19.877f)
                curveTo(13.411f, 21.066f, 11.097f, 21.75f, 8.625f, 21.75f)
                curveTo(6.153f, 21.75f, 3.839f, 21.066f, 1.864f, 19.877f)
                curveTo(1.643f, 19.743f, 1.505f, 19.505f, 1.501f, 19.247f)
                curveTo(1.5f, 19.206f, 1.5f, 19.166f, 1.5f, 19.125f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.25f, 19.128f)
                curveTo(17.25f, 19.176f, 17.249f, 19.224f, 17.249f, 19.272f)
                curveTo(17.243f, 19.611f, 17.161f, 19.938f, 17.016f, 20.232f)
                curveTo(17.217f, 20.244f, 17.42f, 20.25f, 17.625f, 20.25f)
                curveTo(19.221f, 20.25f, 20.732f, 19.88f, 22.076f, 19.221f)
                curveTo(22.323f, 19.1f, 22.484f, 18.854f, 22.496f, 18.579f)
                curveTo(22.498f, 18.511f, 22.5f, 18.443f, 22.5f, 18.375f)
                curveTo(22.5f, 15.683f, 20.317f, 13.5f, 17.625f, 13.5f)
                curveTo(16.878f, 13.5f, 16.171f, 13.668f, 15.539f, 13.968f)
                curveTo(16.614f, 15.406f, 17.25f, 17.191f, 17.25f, 19.125f)
                verticalLineTo(19.128f)
                close()
            }
        }
        .build()
        return _users!!
    }

private var _users: ImageVector? = null
