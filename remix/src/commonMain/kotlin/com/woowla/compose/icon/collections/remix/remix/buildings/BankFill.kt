package com.woowla.compose.icon.collections.remix.remix.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BuildingsGroup

public val BuildingsGroup.BankFill: ImageVector
    get() {
        if (_bankFill != null) {
            return _bankFill!!
        }
        _bankFill = Builder(name = "BankFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(4.0f, 12.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(9.0f, 12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(13.0f, 12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(18.0f, 12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(2.0f, 7.0f)
                lineTo(12.0f, 2.0f)
                lineTo(22.0f, 7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(12.552f, 8.0f, 13.0f, 7.552f, 13.0f, 7.0f)
                curveTo(13.0f, 6.448f, 12.552f, 6.0f, 12.0f, 6.0f)
                curveTo(11.448f, 6.0f, 11.0f, 6.448f, 11.0f, 7.0f)
                curveTo(11.0f, 7.552f, 11.448f, 8.0f, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _bankFill!!
    }

private var _bankFill: ImageVector? = null
