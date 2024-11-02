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

public val OutlineGroup.Users: ImageVector
    get() {
        if (_users != null) {
            return _users!!
        }
        _users = Builder(name = "Users", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 19.128f)
                curveTo(15.833f, 19.37f, 16.714f, 19.5f, 17.625f, 19.5f)
                curveTo(19.104f, 19.5f, 20.503f, 19.158f, 21.746f, 18.548f)
                curveTo(21.749f, 18.49f, 21.75f, 18.433f, 21.75f, 18.375f)
                curveTo(21.75f, 16.097f, 19.903f, 14.25f, 17.625f, 14.25f)
                curveTo(16.207f, 14.25f, 14.956f, 14.965f, 14.214f, 16.055f)
                moveTo(15.0f, 19.128f)
                verticalLineTo(19.125f)
                curveTo(15.0f, 18.012f, 14.715f, 16.966f, 14.214f, 16.055f)
                moveTo(15.0f, 19.128f)
                curveTo(15.0f, 19.163f, 15.0f, 19.199f, 14.999f, 19.234f)
                curveTo(13.137f, 20.355f, 10.957f, 21.0f, 8.625f, 21.0f)
                curveTo(6.294f, 21.0f, 4.113f, 20.355f, 2.251f, 19.234f)
                curveTo(2.25f, 19.198f, 2.25f, 19.162f, 2.25f, 19.125f)
                curveTo(2.25f, 15.604f, 5.104f, 12.75f, 8.625f, 12.75f)
                curveTo(11.033f, 12.75f, 13.129f, 14.085f, 14.214f, 16.055f)
                moveTo(12.0f, 6.375f)
                curveTo(12.0f, 8.239f, 10.489f, 9.75f, 8.625f, 9.75f)
                curveTo(6.761f, 9.75f, 5.25f, 8.239f, 5.25f, 6.375f)
                curveTo(5.25f, 4.511f, 6.761f, 3.0f, 8.625f, 3.0f)
                curveTo(10.489f, 3.0f, 12.0f, 4.511f, 12.0f, 6.375f)
                close()
                moveTo(20.25f, 8.625f)
                curveTo(20.25f, 10.075f, 19.075f, 11.25f, 17.625f, 11.25f)
                curveTo(16.175f, 11.25f, 15.0f, 10.075f, 15.0f, 8.625f)
                curveTo(15.0f, 7.175f, 16.175f, 6.0f, 17.625f, 6.0f)
                curveTo(19.075f, 6.0f, 20.25f, 7.175f, 20.25f, 8.625f)
                close()
            }
        }
        .build()
        return _users!!
    }

private var _users: ImageVector? = null
