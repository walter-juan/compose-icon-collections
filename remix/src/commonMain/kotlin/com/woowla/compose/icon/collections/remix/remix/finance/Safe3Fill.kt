package com.woowla.compose.icon.collections.remix.remix.finance

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.FinanceGroup

public val FinanceGroup.Safe3Fill: ImageVector
    get() {
        if (_safe3Fill != null) {
            return _safe3Fill!!
        }
        _safe3Fill = Builder(name = "Safe3Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                curveTo(2.448f, 3.0f, 2.0f, 3.448f, 2.0f, 4.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 19.552f, 2.448f, 20.0f, 3.0f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 20.0f, 22.0f, 19.552f, 22.0f, 19.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 3.448f, 21.552f, 3.0f, 21.0f, 3.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(15.349f, 8.236f)
                lineTo(16.682f, 6.904f)
                lineTo(18.096f, 8.318f)
                lineTo(16.763f, 9.651f)
                curveTo(17.412f, 10.794f, 17.412f, 12.206f, 16.763f, 13.349f)
                lineTo(18.096f, 14.682f)
                lineTo(16.682f, 16.096f)
                lineTo(15.349f, 14.763f)
                curveTo(14.206f, 15.412f, 12.794f, 15.412f, 11.651f, 14.763f)
                lineTo(10.318f, 16.096f)
                lineTo(8.904f, 14.682f)
                lineTo(10.237f, 13.349f)
                curveTo(9.588f, 12.206f, 9.588f, 10.794f, 10.237f, 9.651f)
                lineTo(8.904f, 8.318f)
                lineTo(10.318f, 6.904f)
                lineTo(11.651f, 8.236f)
                curveTo(12.794f, 7.588f, 14.206f, 7.588f, 15.349f, 8.236f)
                close()
                moveTo(14.737f, 10.262f)
                curveTo(14.054f, 9.579f, 12.946f, 9.579f, 12.263f, 10.262f)
                curveTo(11.579f, 10.946f, 11.579f, 12.054f, 12.263f, 12.737f)
                curveTo(12.946f, 13.421f, 14.054f, 13.421f, 14.737f, 12.737f)
                curveTo(15.421f, 12.054f, 15.421f, 10.946f, 14.737f, 10.262f)
                close()
                moveTo(5.0f, 8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _safe3Fill!!
    }

private var _safe3Fill: ImageVector? = null
