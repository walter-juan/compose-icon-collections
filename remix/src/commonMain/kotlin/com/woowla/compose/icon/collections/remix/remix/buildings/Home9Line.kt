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

public val BuildingsGroup.Home9Line: ImageVector
    get() {
        if (_home9Line != null) {
            return _home9Line!!
        }
        _home9Line = Builder(name = "Home9Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.581f, 2.686f)
                curveTo(12.233f, 2.438f, 11.766f, 2.438f, 11.419f, 2.686f)
                lineTo(1.919f, 9.472f)
                lineTo(3.081f, 11.099f)
                lineTo(12.0f, 4.729f)
                lineTo(20.919f, 11.099f)
                lineTo(22.081f, 9.472f)
                lineTo(12.581f, 2.686f)
                close()
                moveTo(19.581f, 12.686f)
                lineTo(12.581f, 7.686f)
                curveTo(12.233f, 7.438f, 11.766f, 7.438f, 11.419f, 7.686f)
                lineTo(4.419f, 12.686f)
                curveTo(4.156f, 12.874f, 4.0f, 13.177f, 4.0f, 13.5f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 20.552f, 4.448f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(19.552f, 21.0f, 20.0f, 20.552f, 20.0f, 20.0f)
                verticalLineTo(13.5f)
                curveTo(20.0f, 13.177f, 19.844f, 12.874f, 19.581f, 12.686f)
                close()
                moveTo(6.0f, 19.0f)
                verticalLineTo(14.015f)
                lineTo(12.0f, 9.729f)
                lineTo(18.0f, 14.015f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _home9Line!!
    }

private var _home9Line: ImageVector? = null
