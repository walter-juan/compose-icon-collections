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

public val OutlineGroup.GiftTop: ImageVector
    get() {
        if (_giftTop != null) {
            return _giftTop!!
        }
        _giftTop = Builder(name = "GiftTop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.75f)
                verticalLineTo(20.25f)
                moveTo(2.25f, 12.0f)
                horizontalLineTo(21.75f)
                moveTo(6.375f, 17.25f)
                curveTo(9.067f, 17.25f, 11.25f, 15.067f, 11.25f, 12.375f)
                verticalLineTo(12.0f)
                moveTo(17.625f, 17.25f)
                curveTo(14.933f, 17.25f, 12.75f, 15.067f, 12.75f, 12.375f)
                verticalLineTo(12.0f)
                moveTo(3.75f, 20.25f)
                horizontalLineTo(20.25f)
                curveTo(21.078f, 20.25f, 21.75f, 19.578f, 21.75f, 18.75f)
                verticalLineTo(5.25f)
                curveTo(21.75f, 4.422f, 21.078f, 3.75f, 20.25f, 3.75f)
                horizontalLineTo(3.75f)
                curveTo(2.922f, 3.75f, 2.25f, 4.422f, 2.25f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(2.25f, 19.578f, 2.922f, 20.25f, 3.75f, 20.25f)
                close()
                moveTo(16.371f, 10.811f)
                curveTo(14.962f, 12.22f, 12.129f, 11.871f, 12.129f, 11.871f)
                curveTo(12.129f, 11.871f, 11.78f, 9.038f, 13.189f, 7.629f)
                curveTo(14.068f, 6.75f, 15.493f, 6.75f, 16.371f, 7.629f)
                curveTo(17.25f, 8.507f, 17.25f, 9.932f, 16.371f, 10.811f)
                close()
                moveTo(10.773f, 7.629f)
                curveTo(12.182f, 9.038f, 11.834f, 11.871f, 11.834f, 11.871f)
                curveTo(11.834f, 11.871f, 9.0f, 12.22f, 7.591f, 10.811f)
                curveTo(6.712f, 9.932f, 6.712f, 8.507f, 7.591f, 7.629f)
                curveTo(8.47f, 6.75f, 9.894f, 6.75f, 10.773f, 7.629f)
                close()
            }
        }
        .build()
        return _giftTop!!
    }

private var _giftTop: ImageVector? = null
