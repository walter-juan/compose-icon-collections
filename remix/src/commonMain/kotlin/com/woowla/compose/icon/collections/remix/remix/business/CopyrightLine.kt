package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.CopyrightLine: ImageVector
    get() {
        if (_copyrightLine != null) {
            return _copyrightLine!!
        }
        _copyrightLine = Builder(name = "CopyrightLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.288f, 9.428f)
                curveTo(15.413f, 7.974f, 13.819f, 7.0f, 12.0f, 7.0f)
                curveTo(9.24f, 7.0f, 7.0f, 9.24f, 7.0f, 12.0f)
                curveTo(7.0f, 14.76f, 9.24f, 17.0f, 12.0f, 17.0f)
                curveTo(13.819f, 17.0f, 15.413f, 16.027f, 16.288f, 14.572f)
                lineTo(14.573f, 13.544f)
                curveTo(14.048f, 14.417f, 13.093f, 15.0f, 12.0f, 15.0f)
                curveTo(10.342f, 15.0f, 9.0f, 13.658f, 9.0f, 12.0f)
                curveTo(9.0f, 10.342f, 10.342f, 9.0f, 12.0f, 9.0f)
                curveTo(13.093f, 9.0f, 14.049f, 9.584f, 14.573f, 10.457f)
                lineTo(16.288f, 9.428f)
                close()
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                close()
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 7.58f, 7.58f, 4.0f, 12.0f, 4.0f)
                curveTo(16.42f, 4.0f, 20.0f, 7.58f, 20.0f, 12.0f)
                curveTo(20.0f, 16.42f, 16.42f, 20.0f, 12.0f, 20.0f)
                curveTo(7.58f, 20.0f, 4.0f, 16.42f, 4.0f, 12.0f)
                close()
            }
        }
        .build()
        return _copyrightLine!!
    }

private var _copyrightLine: ImageVector? = null
