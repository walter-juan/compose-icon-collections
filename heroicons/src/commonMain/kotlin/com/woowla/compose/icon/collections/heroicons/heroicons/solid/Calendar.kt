package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Calendar: ImageVector
    get() {
        if (_calendar != null) {
            return _calendar!!
        }
        _calendar = Builder(name = "Calendar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.75f, 2.25f)
                curveTo(7.164f, 2.25f, 7.5f, 2.586f, 7.5f, 3.0f)
                verticalLineTo(4.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(3.0f)
                curveTo(16.5f, 2.586f, 16.836f, 2.25f, 17.25f, 2.25f)
                curveTo(17.664f, 2.25f, 18.0f, 2.586f, 18.0f, 3.0f)
                verticalLineTo(4.5f)
                horizontalLineTo(18.75f)
                curveTo(20.407f, 4.5f, 21.75f, 5.843f, 21.75f, 7.5f)
                verticalLineTo(18.75f)
                curveTo(21.75f, 20.407f, 20.407f, 21.75f, 18.75f, 21.75f)
                horizontalLineTo(5.25f)
                curveTo(3.593f, 21.75f, 2.25f, 20.407f, 2.25f, 18.75f)
                verticalLineTo(7.5f)
                curveTo(2.25f, 5.843f, 3.593f, 4.5f, 5.25f, 4.5f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                curveTo(6.0f, 2.586f, 6.336f, 2.25f, 6.75f, 2.25f)
                close()
                moveTo(20.25f, 11.25f)
                curveTo(20.25f, 10.422f, 19.578f, 9.75f, 18.75f, 9.75f)
                horizontalLineTo(5.25f)
                curveTo(4.422f, 9.75f, 3.75f, 10.422f, 3.75f, 11.25f)
                verticalLineTo(18.75f)
                curveTo(3.75f, 19.578f, 4.422f, 20.25f, 5.25f, 20.25f)
                horizontalLineTo(18.75f)
                curveTo(19.578f, 20.25f, 20.25f, 19.578f, 20.25f, 18.75f)
                verticalLineTo(11.25f)
                close()
            }
        }
        .build()
        return _calendar!!
    }

private var _calendar: ImageVector? = null
