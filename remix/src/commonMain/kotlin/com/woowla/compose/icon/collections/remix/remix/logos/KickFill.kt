package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.KickFill: ImageVector
    get() {
        if (_kickFill != null) {
            return _kickFill!!
        }
        _kickFill = Builder(name = "KickFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(10.564f, 5.536f)
                horizontalLineTo(6.255f)
                verticalLineTo(18.463f)
                horizontalLineTo(10.564f)
                verticalLineTo(15.591f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.027f)
                horizontalLineTo(13.436f)
                verticalLineTo(18.463f)
                horizontalLineTo(17.746f)
                verticalLineTo(14.154f)
                horizontalLineTo(16.309f)
                verticalLineTo(12.718f)
                horizontalLineTo(14.873f)
                verticalLineTo(11.282f)
                horizontalLineTo(16.309f)
                verticalLineTo(9.845f)
                horizontalLineTo(17.746f)
                verticalLineTo(5.536f)
                horizontalLineTo(13.436f)
                verticalLineTo(6.972f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.409f)
                horizontalLineTo(10.564f)
                verticalLineTo(5.536f)
                close()
            }
        }
        .build()
        return _kickFill!!
    }

private var _kickFill: ImageVector? = null
