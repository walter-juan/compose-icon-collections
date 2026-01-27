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

public val BusinessGroup.GlobalOffLine: ImageVector
    get() {
        if (_globalOffLine != null) {
            return _globalOffLine!!
        }
        _globalOffLine = Builder(name = "GlobalOffLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.036f, 16.379f)
                lineTo(19.914f, 18.5f)
                lineTo(22.036f, 20.622f)
                lineTo(20.622f, 22.036f)
                lineTo(18.5f, 19.914f)
                lineTo(16.379f, 22.036f)
                lineTo(14.965f, 20.622f)
                lineTo(17.086f, 18.5f)
                lineTo(14.965f, 16.379f)
                lineTo(16.379f, 14.965f)
                lineTo(18.5f, 17.086f)
                lineTo(20.622f, 14.965f)
                lineTo(22.036f, 16.379f)
                close()
                moveTo(12.479f, 2.012f)
                curveTo(17.78f, 2.262f, 22.0f, 6.638f, 22.0f, 12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.033f)
                curveTo(10.19f, 15.539f, 10.936f, 17.915f, 12.139f, 19.996f)
                curveTo(12.221f, 19.995f, 12.302f, 19.995f, 12.384f, 19.991f)
                curveTo(12.554f, 19.983f, 12.723f, 19.97f, 12.89f, 19.951f)
                lineTo(13.11f, 21.94f)
                curveTo(12.902f, 21.962f, 12.691f, 21.978f, 12.479f, 21.988f)
                curveTo(12.32f, 21.996f, 12.16f, 22.0f, 12.0f, 22.0f)
                curveTo(11.84f, 22.0f, 11.68f, 21.996f, 11.521f, 21.988f)
                curveTo(6.22f, 21.738f, 2.0f, 17.362f, 2.0f, 12.0f)
                curveTo(2.0f, 6.638f, 6.22f, 2.262f, 11.521f, 2.012f)
                curveTo(11.68f, 2.004f, 11.84f, 2.0f, 12.0f, 2.0f)
                curveTo(12.16f, 2.0f, 12.32f, 2.004f, 12.479f, 2.012f)
                close()
                moveTo(4.064f, 13.0f)
                curveTo(4.461f, 16.177f, 6.718f, 18.776f, 9.713f, 19.668f)
                curveTo(8.75f, 17.626f, 8.16f, 15.374f, 8.03f, 13.0f)
                horizontalLineTo(4.064f)
                close()
                moveTo(9.713f, 4.331f)
                curveTo(6.718f, 5.223f, 4.461f, 7.823f, 4.064f, 11.0f)
                horizontalLineTo(8.03f)
                curveTo(8.16f, 8.626f, 8.75f, 6.374f, 9.713f, 4.331f)
                close()
                moveTo(12.0f, 4.252f)
                curveTo(10.879f, 6.273f, 10.184f, 8.561f, 10.033f, 11.0f)
                horizontalLineTo(13.967f)
                curveTo(13.816f, 8.561f, 13.121f, 6.273f, 12.0f, 4.252f)
                close()
                moveTo(14.286f, 4.331f)
                curveTo(15.25f, 6.374f, 15.84f, 8.626f, 15.97f, 11.0f)
                horizontalLineTo(19.935f)
                curveTo(19.539f, 7.822f, 17.281f, 5.223f, 14.286f, 4.331f)
                close()
            }
        }
        .build()
        return _globalOffLine!!
    }

private var _globalOffLine: ImageVector? = null
