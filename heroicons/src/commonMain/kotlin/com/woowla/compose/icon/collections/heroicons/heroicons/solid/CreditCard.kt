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

public val SolidGroup.CreditCard: ImageVector
    get() {
        if (_creditCard != null) {
            return _creditCard!!
        }
        _creditCard = Builder(name = "CreditCard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 3.75f)
                curveTo(2.843f, 3.75f, 1.5f, 5.093f, 1.5f, 6.75f)
                verticalLineTo(7.5f)
                horizontalLineTo(22.5f)
                verticalLineTo(6.75f)
                curveTo(22.5f, 5.093f, 21.157f, 3.75f, 19.5f, 3.75f)
                horizontalLineTo(4.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.5f, 9.75f)
                horizontalLineTo(1.5f)
                verticalLineTo(17.25f)
                curveTo(1.5f, 18.907f, 2.843f, 20.25f, 4.5f, 20.25f)
                horizontalLineTo(19.5f)
                curveTo(21.157f, 20.25f, 22.5f, 18.907f, 22.5f, 17.25f)
                verticalLineTo(9.75f)
                close()
                moveTo(4.5f, 13.5f)
                curveTo(4.5f, 13.086f, 4.836f, 12.75f, 5.25f, 12.75f)
                horizontalLineTo(11.25f)
                curveTo(11.664f, 12.75f, 12.0f, 13.086f, 12.0f, 13.5f)
                curveTo(12.0f, 13.914f, 11.664f, 14.25f, 11.25f, 14.25f)
                horizontalLineTo(5.25f)
                curveTo(4.836f, 14.25f, 4.5f, 13.914f, 4.5f, 13.5f)
                close()
                moveTo(5.25f, 15.75f)
                curveTo(4.836f, 15.75f, 4.5f, 16.086f, 4.5f, 16.5f)
                curveTo(4.5f, 16.914f, 4.836f, 17.25f, 5.25f, 17.25f)
                horizontalLineTo(8.25f)
                curveTo(8.664f, 17.25f, 9.0f, 16.914f, 9.0f, 16.5f)
                curveTo(9.0f, 16.086f, 8.664f, 15.75f, 8.25f, 15.75f)
                horizontalLineTo(5.25f)
                close()
            }
        }
        .build()
        return _creditCard!!
    }

private var _creditCard: ImageVector? = null
