package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.Key2Line: ImageVector
    get() {
        if (_key2Line != null) {
            return _key2Line!!
        }
        _key2Line = Builder(name = "Key2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.758f, 11.828f)
                lineTo(18.607f, 3.979f)
                lineTo(20.021f, 5.393f)
                lineTo(18.607f, 6.808f)
                lineTo(21.081f, 9.282f)
                lineTo(19.667f, 10.697f)
                lineTo(17.192f, 8.222f)
                lineTo(15.778f, 9.636f)
                lineTo(17.899f, 11.757f)
                lineTo(16.485f, 13.172f)
                lineTo(14.364f, 11.05f)
                lineTo(12.172f, 13.242f)
                curveTo(13.458f, 15.184f, 13.246f, 17.825f, 11.535f, 19.535f)
                curveTo(9.583f, 21.488f, 6.417f, 21.488f, 4.464f, 19.535f)
                curveTo(2.512f, 17.583f, 2.512f, 14.417f, 4.464f, 12.465f)
                curveTo(6.175f, 10.754f, 8.816f, 10.542f, 10.758f, 11.828f)
                close()
                moveTo(10.121f, 18.121f)
                curveTo(11.293f, 16.95f, 11.293f, 15.05f, 10.121f, 13.879f)
                curveTo(8.95f, 12.707f, 7.05f, 12.707f, 5.879f, 13.879f)
                curveTo(4.707f, 15.05f, 4.707f, 16.95f, 5.879f, 18.121f)
                curveTo(7.05f, 19.293f, 8.95f, 19.293f, 10.121f, 18.121f)
                close()
            }
        }
        .build()
        return _key2Line!!
    }

private var _key2Line: ImageVector? = null
